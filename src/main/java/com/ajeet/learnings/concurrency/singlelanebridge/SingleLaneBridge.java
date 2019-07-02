package com.ajeet.learnings.concurrency.singlelanebridge;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * LIMITATION:
 * It will not allow vehicles from other side until required number of vehicles will not cross from current direction
 */
public final class SingleLaneBridge {
    private final int capacity;

    private final Lock lock = new ReentrantLock();
    private final Condition[] bridgeAccess = {lock.newCondition(), lock.newCondition()};

    private final int[] vehiclesWaitingOnBridge = new int[2];
    private int vehiclesOnBridge = 0;
    private int vehiclesCrossedSoFar = 0;
    private Direction currentDirection = Direction.LEFT;

    public SingleLaneBridge(int capacity) {
        this.capacity = capacity;
        // switchDirection(currentDirection);
    }

    /**
     * This is an important function, it should allow a vehicle if the bride is not opened from that direction
     * or if bridge is opened but bridge is full to allowed capacity
     *
     * @param vehicle
     * @param direction
     * @throws InterruptedException
     */
    public void arrive(Vehicle vehicle, Direction direction) throws InterruptedException {
        vehiclesWaitingOnBridge[direction.ordinal()]++;
        try {
            lock.lock();
            if ((vehiclesOnBridge == capacity) || !direction.equals(currentDirection)) {
                System.out.println("### WAITING ###" + vehicle.getNumber() + " is waiting from direction " + direction);
                bridgeAccess[direction.ordinal()].await();
            }
            vehiclesWaitingOnBridge[direction.ordinal()]--;
            vehiclesOnBridge++;
        } finally {
            lock.unlock();
        }
    }

    public void cross(Vehicle vehicle, Direction direction) {
        System.out.println(vehicle.getNumber() + " is moving from direction " + direction);
        try {
            TimeUnit.NANOSECONDS.sleep(10000);
        } catch (InterruptedException e) {
            //Do Nothing
        }
    }

    /**
     * This is also an important function, it should remove the vehicle from bridge
     * and if bridge is empty and as many vehicles as capacity are already crossed the bridge than switch the direction.
     *
     * @param vehicle
     * @param direction
     * @throws InterruptedException
     */
    public void exit(Vehicle vehicle, Direction direction) throws InterruptedException {
        try {
            lock.lock();
            vehiclesOnBridge--;
            vehiclesCrossedSoFar++;
            switchDirection(direction);
        } finally {
            lock.unlock();
        }
    }

    private void switchDirection(Direction direction) {
        if (vehiclesCrossedSoFar == capacity) {
            currentDirection = direction.equals(Direction.LEFT) ? Direction.RIGHT : Direction.LEFT;
            vehiclesCrossedSoFar = 0;
            System.out.println("============================================================================");
            System.out.println("    =================> Bridge is opened from " + currentDirection + " <============");
            System.out.println("============================================================================");
            bridgeAccess[currentDirection.ordinal()].signalAll();
        }
    }
}
