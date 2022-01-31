package com.whizlabs.spring.basics.aop.pointcut;

public class Person {
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }


    public void printFullName() {
        System.out.println("Full Name: " + fullName);
    }

    public void log(String message) {
        System.out.println("Logged message: " + message);
    }
}
