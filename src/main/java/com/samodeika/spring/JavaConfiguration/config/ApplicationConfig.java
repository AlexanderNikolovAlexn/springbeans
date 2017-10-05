package com.samodeika.spring.JavaConfiguration.config;

import com.samodeika.spring.JavaConfiguration.beans.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.samodeika.spring.JavaConfiguration.beans")
//@ImportResource("application-context.xml")
public class ApplicationConfig {

    //<bean class="com.samodeika.spring.XMLConfiguration.beans.BeanA"/>
//    @Bean(name = {"car", "yellowCar"})
//    public Car car() {
//        return new Car();
//    }

}
