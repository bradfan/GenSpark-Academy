package com.whizlabs.spring.basics.spel.beanspel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanSpelApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanSpelConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getFullName());
        System.out.println(person.getAge());
    }
}
