package com.example.welcome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example")
public class WelcomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(WelcomeApplication.class, args);
    }

}
