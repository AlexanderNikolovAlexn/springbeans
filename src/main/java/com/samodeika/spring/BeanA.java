package com.samodeika.spring;

public class BeanA {

    public BeanA() {
        System.out.println("Spring instantiated me");
    }

    public void printMe() {
        System.out.println("I`m BeanA!Ref: " + this.toString());
    }

}
