package com.samodeika.spring.AnnotationConfiguration.beans;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    private String name;

    public String getName() {
        return name;
    }

    @Required
    @Value("Alex")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "name='" + name + '\'' +
                '}';
    }
}
