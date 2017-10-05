package com.samodeika.spring.JavaConfiguration.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class Car2 implements ICar{

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
