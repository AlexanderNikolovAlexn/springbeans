package com.samodeika.spring.XMLConfiguration;

import com.samodeika.spring.BeanA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    static ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

    public static void main(String[] args) {


        // Constructor Injection
        // Setter Injection
        // Factory Instantiation

        // Test bean Scopes
        testBeanScopes();

    }

    private static void testBeanScopes() {
        BeanA beanA = context.getBean(BeanA.class);
        beanA.printMe();

        BeanA anotherBeanA = context.getBean(BeanA.class);
        anotherBeanA.printMe();
    }

}
