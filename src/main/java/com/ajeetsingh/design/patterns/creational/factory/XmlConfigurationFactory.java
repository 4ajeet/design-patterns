package com.ajeetsingh.design.patterns.creational.factory;

public final class XmlConfigurationFactory extends ConfigurationFactory {

    private static class ConfigurationFactoryHelper {
        private final static XmlConfigurationFactory INSTANCE = new XmlConfigurationFactory();
    }

    public final XmlConfiguration getConfiguration(){
        return new XmlConfiguration();
    }

    public static XmlConfigurationFactory getInstance() {
        return ConfigurationFactoryHelper.INSTANCE;
    }

}
