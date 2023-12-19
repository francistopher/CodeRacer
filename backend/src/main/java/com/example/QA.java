package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class QA {
    @RequestMapping("/")
    String home() {
        return "<h1>QA</h1><h2>Code Questions & Answers</h2>";
    }

    public static void main(String[] args) {
        SpringApplication.run(QA.class, args);
    }
}
