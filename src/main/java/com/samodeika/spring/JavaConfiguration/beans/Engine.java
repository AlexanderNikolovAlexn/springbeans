package com.samodeika.spring.JavaConfiguration.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    private int horsePowers;

    public int getHorsePowers() {
        return horsePowers;
    }

    @Value("136")
    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePowers=" + horsePowers +
                '}';
    }
}
