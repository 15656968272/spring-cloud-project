package com.study.configuration;


import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;

import java.util.Collections;


/**
 * {@link org.springframework.cloud.bootstrap.BootstrapImportSelectorConfiguration} 会作为开启入口
 * 这种方式是利用 BootstrapConfiguration 加载 实现它的 SPI.那么这些SPI.就会进行调用 比如
 * {@link org.springframework.cloud.bootstrap.config.PropertySourceBootstrapConfiguration}
 * {@link org.springframework.cloud.bootstrap.BootstrapApplicationListener} 这个监听会在 springboot.run. 准备环境进行调用。已经实例化了 属于应用的context
 * BootstrapImportSelectorConfiguration 创建了springboot的context,然后进行
 * {@link org.springframework.cloud.bootstrap.config.PropertySourceBootstrapConfiguration} 调用
 * PropertySourceBootstrapConfiguration#initialize() 会进行locate()调用 这个会PropertySource加入到环境中
 * NOTE: {@link org.springframework.context.annotation.Configuration} 注解 CustomPropertySourceLocator
 * 不行的原因也是 不同context里面. spring cloud的context压根扫描不到
 * <p>
 * 另一种是利用监听 {@link com.study.listener.MyPropertiesListener}
 *
 * @see org.springframework.cloud.bootstrap.BootstrapConfiguration
 * {@link org.springframework.cloud.bootstrap.config.PropertySourceBootstrapConfiguration}
 */

@Order(Ordered.HIGHEST_PRECEDENCE + 2)
public class CustomPropertySourceLocator implements PropertySourceLocator {

    @Override
    public PropertySource<?> locate(Environment environment) {
        return new MapPropertySource("customProperty",
                Collections.singletonMap("zhouxiaoling", "jinsheng"));
    }
}
