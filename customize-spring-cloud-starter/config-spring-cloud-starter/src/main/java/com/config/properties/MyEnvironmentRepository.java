package com.config.properties;

import com.config.properties.annotation.EnableMyEnvironment;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * {@link EnableMyEnvironment} 充分利用spring 加载机制，实现自定义类的加载
 * 配合这个注解，可以使用jar包的导入
 */
@ComponentScan
@Configuration
@ConditionalOnMissingBean(EnvironmentRepository.class)
public class MyEnvironmentRepository implements EnvironmentRepository {

    @Override
    public Environment findOne(String application, String profile, String label) {
        Map<String, String> map = new HashMap<>();
        map.put("jin", "sheng");
        Environment environment = new Environment("default", profile);
        List<PropertySource> propertySources = environment.getPropertySources();
        PropertySource propertySource = new PropertySource("name", map);
        propertySources.add(propertySource);
        return environment;
    }
}
