package com.study.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;



public class MyPropertiesEvent extends ApplicationEnvironmentPreparedEvent {
    /**
     * Create a new {@link ApplicationEnvironmentPreparedEvent} instance.
     *
     * @param application the current application
     * @param args        the arguments the application is running with
     * @param environment the environment that was just created
     */
    public MyPropertiesEvent(SpringApplication application, String[] args, ConfigurableEnvironment environment) {
        super(application, args, environment);
        MutablePropertySources propertySources = environment.getPropertySources();


    }
}
