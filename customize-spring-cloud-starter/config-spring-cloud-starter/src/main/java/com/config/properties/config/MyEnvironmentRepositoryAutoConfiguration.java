package com.config.properties.config;


import com.config.properties.MyEnvironmentRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.context.annotation.Bean;


/**
 * 这种方式随机性太大 不可用
 */
//@Configuration(proxyBeanMethods = false)
@Deprecated
public class MyEnvironmentRepositoryAutoConfiguration {



    @Bean
    @ConditionalOnMissingBean(EnvironmentRepository.class)
    public EnvironmentRepository environmentRepository() {
        return new MyEnvironmentRepository();
    }
}
