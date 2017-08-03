package com.ajeetsingh.design.patterns.singleton;

import javax.xml.parsers.DocumentBuilderFactory;

public class Client {

    public static void main(String[] args) {
        SingletonWithData singletonWithData = SingletonWithData.INSTANCE;
        singletonWithData.initialize("a");
        singletonWithData.initialize("b");

        singletonWithData.performOperation();

        DocumentBuilderFactory documentBuilderFactory;
    }
}
