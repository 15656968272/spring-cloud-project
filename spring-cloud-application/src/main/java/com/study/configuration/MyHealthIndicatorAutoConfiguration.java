package com.study.configuration;


import com.study.health.MyHealthIndicator;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Deprecated
@Configuration
public class MyHealthIndicatorAutoConfiguration {


    @Bean
    public HealthIndicator myHealthIndicator() {
        return new MyHealthIndicator();

    }

}
