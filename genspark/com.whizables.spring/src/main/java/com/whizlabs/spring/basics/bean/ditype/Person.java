package com.whizlabs.spring.basics.bean.ditype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private final Name name;
    private Address address;

    public Person(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    public void setHome(Address address) {
        this.address = address;
    }
}
