package com.ajeetsingh.design.patterns.creational.singleton;

import static org.junit.Assert.*;

import com.ajeet.learnings.design.patterns.creational.singleton.SingletonJDBCConfiguration;
import org.junit.Test;

public final class SingletonJDBCConfigurationTest {

    @Test
    public void getConfiguration(){
        SingletonJDBCConfiguration jdbcConfiguration1 = SingletonJDBCConfiguration.getConfiguration();
        SingletonJDBCConfiguration jdbcConfiguration2 = SingletonJDBCConfiguration.getConfiguration();

        assertTrue(jdbcConfiguration1 == jdbcConfiguration2);
    }
}
