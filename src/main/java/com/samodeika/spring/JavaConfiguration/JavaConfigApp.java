package com.samodeika.spring.JavaConfiguration;

import com.samodeika.spring.JavaConfiguration.beans.Car;
import com.samodeika.spring.JavaConfiguration.beans.ICar;
import com.samodeika.spring.JavaConfiguration.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        ICar car = context.getBean(ICar.class);
        car.drive();
        System.out.println(car);

    }

}
