package com.ajeetsingh.design.patterns.singleton;

public enum SingletonWithData {
    INSTANCE;

    private String data = null;

    public void initialize(String argument) {
        this.data = argument;
    }

    public void performOperation() {
        System.out.println(data);
    }
}
