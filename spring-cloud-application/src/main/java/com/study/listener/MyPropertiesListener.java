package com.study.listener;

import com.study.configuration.CustomPropertySourceLocator;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.Collections;


/**
 * 使用监听的方式来 改变环境
 * 另一种方式
 *
 * @param <T>
 * @see CustomPropertySourceLocator spring.factories这种方式需要深刻理解 spring上下文层级关系
 */
public class MyPropertiesListener<T extends ApplicationEvent>
        implements ApplicationListener<ApplicationEnvironmentPreparedEvent>, Ordered {


    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        MapPropertySource mapPropertySource = new MapPropertySource("customProperty-myproperties",
                Collections.<String,
                        Object>singletonMap("zhouxiaoling", "jinsheng"));
        MutablePropertySources propertySources = event.getEnvironment().getPropertySources();
        propertySources.addFirst(mapPropertySource);
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE + 6;
    }
}
