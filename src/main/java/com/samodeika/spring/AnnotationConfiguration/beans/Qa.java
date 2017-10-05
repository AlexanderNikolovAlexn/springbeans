package com.samodeika.spring.AnnotationConfiguration.beans;

public class Qa {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Qa{" +
                "name='" + name + '\'' +
                '}';
    }
}
