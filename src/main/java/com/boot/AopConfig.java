package com.boot;

import org.springframework.context.annotation.*;


@Configuration
@ComponentScan(basePackages = "com.boot")
@EnableAspectJAutoProxy
public class AopConfig {

    @Bean
    Service_1 service_1(){
        return new Service_1();
    }

    @Bean
    Service_2 service_2(){
        return new Service_2();
    }
}
