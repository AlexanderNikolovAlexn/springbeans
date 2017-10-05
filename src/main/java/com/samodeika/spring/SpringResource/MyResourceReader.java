package com.samodeika.spring.SpringResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Component
public class MyResourceReader {

    @Autowired
    //@Value("https://www.sportal.bg/")
    @Value("classpath:test.txt")
    private Resource resource;

    public void print() {
        System.out.println(resource.getClass().getSimpleName());
        String output = "";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()))) {
            /*
            // Old way of reading
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println(line);
            }
            */
            //lambda way to get output
            output = reader.lines().collect(Collectors.joining("\n"));

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(output);
    }

}
