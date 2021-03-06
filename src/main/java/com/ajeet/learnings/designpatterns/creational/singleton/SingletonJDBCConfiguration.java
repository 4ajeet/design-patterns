package com.ajeet.learnings.designpatterns.creational.singleton;

import java.util.Properties;

import static com.ajeet.learnings.common.utilities.Utilities.loadPropertiesFromClasspath;

public final class SingletonJDBCConfiguration {
    private final String jdbcUrl;
    private final String username;
    private final String password;

    public static final String JDBC_URL_KEY = "jdbcUrl";
    public static final String USERNAME_KEY = "username";
    public static final String PASSWORD_KEY = "password";
    public static final String CONFIG_FILE_NAME_KEY = "jdbc.properties";

    private SingletonJDBCConfiguration() {
        Properties configProperties = loadPropertiesFromClasspath(CONFIG_FILE_NAME_KEY);
        jdbcUrl = configProperties.getProperty(JDBC_URL_KEY);
        username = configProperties.getProperty(USERNAME_KEY);
        password = configProperties.getProperty(PASSWORD_KEY);
    }

    private static class ConfigurationHelper {
        private final static SingletonJDBCConfiguration INSTANCE = new SingletonJDBCConfiguration();
    }

    public static final SingletonJDBCConfiguration getConfiguration(){
        return  ConfigurationHelper.INSTANCE;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        SingletonJDBCConfiguration singletonJDBCConfiguration = new SingletonJDBCConfiguration();
        System.out.println(singletonJDBCConfiguration);
    }
}
