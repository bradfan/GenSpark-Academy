package com.whizlabs.spring.basics.bean.jeenotation;

import javax.annotation.ManagedBean;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;


@ManagedBean
public class Person {
    private Identity identity;
    private Location location;

    public Person(Identity identity, Location location) {
        this.identity = identity;
        this.location = location;
    }

    public Identity getIdentity() {
        return identity;
    }

    @Resource(name = "getIdentity")
    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public Location getLocation() {
        return location;
    }

    @Inject
    public void setLocation(@Named("getLocation") Location location) {
        this.location = location;
    }
}
