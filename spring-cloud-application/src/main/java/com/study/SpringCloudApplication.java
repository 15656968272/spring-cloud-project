package com.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class SpringCloudApplication {

    public static void main(String[] args) {

//        ConfigurableApplicationContext run = SpringApplication.run(SpringCloudApplication.class, args);
//        System.out.println(run);

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.setId("jinsheng");
        annotationConfigApplicationContext.refresh();
        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(SpringCloudApplication.class);
        springApplicationBuilder.parent(annotationConfigApplicationContext).run(args);
        System.out.println(springApplicationBuilder);
    }


}
