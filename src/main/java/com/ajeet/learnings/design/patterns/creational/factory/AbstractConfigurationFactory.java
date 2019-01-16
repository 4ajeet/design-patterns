package com.ajeet.learnings.design.patterns.creational.factory;

public abstract class ConfigurationFactory {

    public abstract Configuration getConfiguration();

    public static ConfigurationFactory getInstance(ConfigurationType type){
        switch (type){
            case Json: return  JsonConfigurationFactory.getInstance();
            case Xml: return XmlConfigurationFactory.getInstance();
            default: throw new RuntimeException("Unsupported configuration type.");
        }
    }
}
