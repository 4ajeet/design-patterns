package com.ajeetsingh.design.patterns.creational.factory;

public abstract class ConfigurationFactory {

    public static ConfigurationFactory getInstance(ConfigurationType type){
        switch (type){
            case Json: return  JsonConfigurationFactory.getInstance();
            case Xml: return XmlConfigurationFactory.getInstance();
            default: throw new RuntimeException("Unsupported configuration type.");
        }

    }
}
