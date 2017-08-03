package com.ajeetsingh.design.patterns.creational.factory;

public final class JsonConfigurationFactory extends  ConfigurationFactory{

    private static class ConfigurationFactoryHelper {
        private final static JsonConfigurationFactory INSTANCE = new JsonConfigurationFactory();
    }

    public final JsonConfiguration getConfiguration(){
        return new JsonConfiguration();
    }

    public static JsonConfigurationFactory getInstance() {
        return ConfigurationFactoryHelper.INSTANCE;
    }
}
