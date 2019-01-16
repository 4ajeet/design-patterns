package com.ajeet.learnings.design.patterns.creational.factory;

public final class JsonConfigurationFactory implements ConfigurationFactory{

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
