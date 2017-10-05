package com.samodeika.spring.SpringResource;

import com.samodeika.spring.SpringResource.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);


        MyResourceReader reader = context.getBean(MyResourceReader.class);
        reader.print();
    }

}
