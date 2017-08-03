package com.ajeetsingh.design.patterns.creational.singleton;

import static org.junit.Assert.*;
import org.junit.Test;

public final class SingletonJDBCConfigurationTester {

    @Test
    public void getConfiguration(){
        SingletonJDBCConfiguration jdbcConfiguration1 = SingletonJDBCConfiguration.getConfiguration();
        SingletonJDBCConfiguration jdbcConfiguration2 = SingletonJDBCConfiguration.getConfiguration();

        assertTrue(jdbcConfiguration1 == jdbcConfiguration2);
    }
}
