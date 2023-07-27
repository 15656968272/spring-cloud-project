package com.config.properties.annotation;


import com.config.properties.MyEnvironmentRepository;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;


/**
 * 注解方式来加载 外部的 MyEnvironmentRepository
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyEnvironmentRepository.class)
public @interface EnableMyEnvironment {

}
