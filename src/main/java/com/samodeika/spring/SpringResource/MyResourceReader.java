package com.samodeika.spring.SpringResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class MyResourceReader {

    @Autowired
    @Value("https://www.sportal.bg/")
    //@Value("classpath:test.txt")
    private Resource resource;

    public void print() {
        System.out.println(resource.getClass().getSimpleName());

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
