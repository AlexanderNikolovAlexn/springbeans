package com.samodeika.spring.AnnotationConfiguration.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Analyst {

    @Value("Viktor")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Analyst{" +
                "name='" + name + '\'' +
                '}';
    }
}
