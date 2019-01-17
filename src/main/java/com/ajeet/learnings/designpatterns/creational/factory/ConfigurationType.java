package com.ajeet.learnings.designpatterns.creational.factory;

public enum ConfigurationType {
    Json {
        public ConfigurationFactory getConfigurationFactory(){
            return new JsonConfigurationFactory();
        }
    },
    Xml {
        public ConfigurationFactory getConfigurationFactory(){
            return new XmlConfigurationFactory();
        }
    };

    public abstract ConfigurationFactory getConfigurationFactory();
}
