package com.samodeika.spring.JavaConfiguration.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Component
@Primary
public class Car implements ICar{

    @Value("Yellow")
    private String colour;
    private Engine engine;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    @Inject
    //@Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("I`m driving here!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", engine=" + engine +
                '}';
    }
}
