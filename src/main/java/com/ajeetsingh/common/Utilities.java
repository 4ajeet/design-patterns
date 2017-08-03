package com.ajeetsingh.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class Utilities {

    private Utilities(){}

    public static final Properties loadPropertiesFromClasspath(String fileName)  {
        try {
            Properties properties = new Properties();
            InputStream inputStream = Utilities.class.getResourceAsStream("/" + fileName);
            if(inputStream == null) {
                throw new RuntimeException(fileName + " file not found in classpath.");
            }
            properties.load(inputStream);
            return properties;
        } catch (IOException ex){
            throw new RuntimeException(ex);
        }
    }

}
