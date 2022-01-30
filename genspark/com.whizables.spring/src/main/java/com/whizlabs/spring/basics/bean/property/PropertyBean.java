package com.whizlabs.spring.basics.bean.property;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertyBean {
    private Environment environment;
    private int publishedYear;

    public PropertyBean(Environment environment) {
        this.environment = environment;
    }

    public String getCourse() {
        return environment.getProperty("course");
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    @Value("${published-year}")
    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}
