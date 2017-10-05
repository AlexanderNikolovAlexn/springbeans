package com.samodeika.spring.XMLConfiguration.beans;

public class BeanB {

    private String name;

    public BeanB() {
        System.out.println("BeanB! Spring instantiated me");
    }

    public BeanB(String name) {

        System.out.println("Constructor Injection!");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printMe() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                '}';
    }
}
