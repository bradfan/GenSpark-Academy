package com.whizlabs.spring.basics.ioc.containerandbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanApp {
    public static void main(String[] args) {
        ApplicationContext contextWithXmlConfig = new ClassPathXmlApplicationContext("ioc/basic-config.xml");
        Person john = (Person) contextWithXmlConfig.getBean("person");
        System.out.println(john.getFullName());
        System.out.println(john.getAddress());
    }
}
