package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@SpringBootApplication
public class QA {

    @RequestMapping("/")
    public String home() {
        return "<h1>QA</h1>";
    }

    @RequestMapping("/resource")
    public Map<String, Object> newHomePage() {
        Map<String, Object> model = new HashMap<>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "QA Backend");
        return model;
    }


    public static void main(String[] args) {
        SpringApplication.run(QA.class, args);
    }
}
