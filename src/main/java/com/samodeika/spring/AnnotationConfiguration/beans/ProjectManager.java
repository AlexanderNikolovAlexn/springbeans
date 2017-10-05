package com.samodeika.spring.AnnotationConfiguration.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ProjectManager {

    private String name;

    public String getName() {
        return name;
    }

    @Autowired
    @Qualifier("main")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "name='" + name + '\'' +
                '}';
    }
}
