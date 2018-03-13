package com.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class AopMain {

    public static void main(String[] args)throws IOException {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        Service_1 service_1 = (Service_1) applicationContext.getBean("service_1");
        Service_2 service_2 = (Service_2) applicationContext.getBean("service_2");
        service_1.get_Service_1();
        service_1.throwException_Service_1();
        service_2.get_Service_2();
       // service_2.display();

    }
}
