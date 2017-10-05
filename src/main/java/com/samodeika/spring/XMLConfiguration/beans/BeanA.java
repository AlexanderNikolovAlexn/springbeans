package com.samodeika.spring.XMLConfiguration.beans;

public class BeanA {

    private String name;

    public BeanA() {
        System.out.println("Dev! Spring instantiated me");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printMe() {
        System.out.println("I`m Dev!Ref: " + this.toString());
    }

    public void init() {
        System.out.println("Executed init method!");
    }

    public void destroy() {
        System.out.println("Executed destroy method!");
    }
}
