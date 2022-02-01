package com.whizlabs.spring.basics.aop.beforeandafter;

public class Person {
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public void printFullName() {
        System.out.println("Full Name: " + fullName);
    }

    public void throwException() {
        System.out.println("Printed by Person#throwException");
        throw new RuntimeException();
    }


}
