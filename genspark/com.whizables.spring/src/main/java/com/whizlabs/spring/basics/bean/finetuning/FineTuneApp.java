package com.whizlabs.spring.basics.bean.finetuning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FineTuneApp {
    public static void main(String[] args) {
        ApplicationContext context  =new AnnotationConfigApplicationContext(FineTuneConfig.class);
        Creature creature = context.getBean(Creature.class);
        System.out.println(creature.getBird().move());
        System.out.println(creature.getDog().move());
        System.out.println(creature.getCat().move());
        System.out.println(creature.getAnimals());
    }
}
