package com.ajeet.learnings.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class BlockingArraysQueueApp {

    public static void main(String[] args) {
        BlockingArraysQueue<Integer>  blockingQueue = new BlockingArraysQueue<>(5);
        AtomicInteger atomicInteger = new AtomicInteger(1);

        for(int i=0; i< 10; i++){
            new Thread(() -> {
                try {
                    blockingQueue.put(atomicInteger.getAndIncrement());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(() -> {
                try {
                    System.out.println(blockingQueue.remove());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

class BlockingArraysQueue<T> {
    private final int _capacity;
    private final T[] _buffer;
    private final Lock _exclusiveLock;
    private final Condition _isFullCondition;
    private final Condition _isEmptyCondition;

    private int _addIndex = 0;
    private int _removeIndex = 0;
    private int _count = 0;

    BlockingArraysQueue(int capacity) {
        _capacity = capacity;
        _buffer = (T[]) new Object[_capacity];
        _exclusiveLock = new ReentrantLock();

        _isFullCondition = _exclusiveLock.newCondition();
        _isEmptyCondition  = _exclusiveLock.newCondition();
    }

    boolean isFull(){
        return _count == _buffer.length;
    }

    boolean isEmpty() {
        return _count == 0;
    }

    void put(T element) throws InterruptedException {
        _exclusiveLock.lock();
        try{
            while (isFull()){
                _isFullCondition.await();
            }
            _buffer[_addIndex] = element;
            if(++_addIndex == _buffer.length)
                _addIndex = 0;
            _isEmptyCondition.signalAll();
        } finally {
            _exclusiveLock.unlock();
        }
    }

    T remove() throws InterruptedException {
        _exclusiveLock.lock();
        try{
            while (isEmpty()){
                _isEmptyCondition.await();
            }
            T element = _buffer[_removeIndex];
            if(++_removeIndex == _buffer.length)
                _removeIndex = 0;
            _isFullCondition.signalAll();
            return element;
        } finally {
            _exclusiveLock.unlock();
        }
    }
}