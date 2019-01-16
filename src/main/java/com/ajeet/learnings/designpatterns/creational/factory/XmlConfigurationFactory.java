package com.ajeet.learnings.design.patterns.creational.factory;

public final class XmlConfigurationFactory implements ConfigurationFactory {

    private static class ConfigurationFactoryHelper {
        private final static XmlConfigurationFactory INSTANCE = new XmlConfigurationFactory();
    }

    @Override
    public final XmlConfiguration getConfiguration(){
        return new XmlConfiguration();
    }

    public static XmlConfigurationFactory getInstance() {
        return ConfigurationFactoryHelper.INSTANCE;
    }

}
