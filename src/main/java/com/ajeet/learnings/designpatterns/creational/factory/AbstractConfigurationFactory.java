package com.ajeet.learnings.designpatterns.creational.factory;

public abstract class AbstractConfigurationFactory implements ConfigurationFactory {

    public abstract Configuration getConfiguration();

    public static ConfigurationFactory getInstance(ConfigurationType type){
        switch (type){
            case Json: return  JsonConfigurationFactory.getInstance();
            case Xml: return XmlConfigurationFactory.getInstance();
            default: throw new RuntimeException("Unsupported configuration type.");
        }
    }

    public static ConfigurationFactory getInstance(String type){
        return getInstance(ConfigurationType.valueOf(type));
    }
}
