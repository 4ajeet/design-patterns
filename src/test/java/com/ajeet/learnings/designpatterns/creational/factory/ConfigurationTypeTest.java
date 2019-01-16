package com.ajeet.learnings.design.patterns.creational.factory;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public final class ConfigurationTypeTest {

    @Test
    public void json(){
        ConfigurationFactory configurationFactory = ConfigurationType.Json.getConfigurationFactory();
        assertTrue(configurationFactory instanceof JsonConfigurationFactory);
        assertTrue(configurationFactory.getConfiguration() instanceof JsonConfiguration);
    }

    @Test
    public void xml(){
        ConfigurationFactory configurationFactory = ConfigurationType.Xml.getConfigurationFactory();
        assertTrue(configurationFactory instanceof XmlConfigurationFactory);
        assertTrue(configurationFactory.getConfiguration() instanceof XmlConfiguration);
    }

}
