package com.ajeet.learnings.designpatterns.creational.factory;

import static org.junit.Assert.*;
import org.junit.Test;

public final class AbstractConfigurationFactoryTest {

    @Test
    public void json(){
        ConfigurationFactory configurationFactory = AbstractConfigurationFactory.getInstance(ConfigurationType.Json);
        assertTrue(configurationFactory instanceof JsonConfigurationFactory);
        assertTrue(configurationFactory.getConfiguration() instanceof JsonConfiguration);
    }

    @Test
    public void xml(){
        ConfigurationFactory configurationFactory = AbstractConfigurationFactory.getInstance(ConfigurationType.Xml);
        assertTrue(configurationFactory instanceof XmlConfigurationFactory);
        assertTrue(configurationFactory.getConfiguration() instanceof XmlConfiguration);
    }

    @Test
    public void json_from_name(){
        ConfigurationFactory configurationFactory = AbstractConfigurationFactory.getInstance("Json");
        assertTrue(configurationFactory instanceof JsonConfigurationFactory);
        assertTrue(configurationFactory.getConfiguration() instanceof JsonConfiguration);
    }

    @Test
    public void xml_from_name(){
        ConfigurationFactory configurationFactory = AbstractConfigurationFactory.getInstance("Xml");
        assertTrue(configurationFactory instanceof XmlConfigurationFactory);
        assertTrue(configurationFactory.getConfiguration() instanceof XmlConfiguration);
    }

}
