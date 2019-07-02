package com.ajeet.learnings.designpatterns.creational.singleton;

public final class MySingleton {

    private MySingleton() {
    }

    public static MySingleton getInstance(){
        return MySingletonHelper.INSTANCE;
    }

    private static final class MySingletonHelper {
        private static final MySingleton INSTANCE = new MySingleton();
    }
}
