package com.ajeet.learnings.concurrency.singlelanebridge;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class SingleLaneBridgeProblem {
    private static final AtomicInteger ATOMIC_INTEGER = new AtomicInteger(1);

    public static void main(String[] args) {
        SingleLaneBridge bridge = new SingleLaneBridge(5);
        for (int i = 0; i < 10; i++) {
            Thread leftThread = new Thread(createVehicleTask(bridge, Direction.LEFT));
            leftThread.start();
            try {
                TimeUnit.NANOSECONDS.sleep(100);
            } catch (InterruptedException e) {
                //Do Nothing
            }
            Thread rightThread = new Thread(createVehicleTask(bridge, Direction.RIGHT));
            rightThread.start();
        }
    }

    private static Runnable createVehicleTask(SingleLaneBridge bridge, Direction direction) {
        return () -> {
            Vehicle vehicle = new Vehicle("Vehicle" + ATOMIC_INTEGER.getAndAdd(1));
            try {
                bridge.arrive(vehicle, direction);
                bridge.cross(vehicle, direction);
                bridge.exit(vehicle, direction);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }
}
