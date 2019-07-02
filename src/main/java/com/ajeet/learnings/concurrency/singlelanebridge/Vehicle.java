package com.ajeet.learnings.concurrency.singlelanebridge;

public final class Vehicle {
    private final String number;

    public Vehicle(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}