package com.whizlabs.spring.basics.ioc.introduction;

import com.whizlabs.spring.basics.ioc.introduction.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class IntroductionConfig {
    @Bean
    public Person getPerson() {
        return new Person("Jane Roe");


    }

}
