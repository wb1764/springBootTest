package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableJpaRepositories("com.example.repository")  // JPA Repository °æ·Î
public class DemoApplication {
    public static void main(String[] args) {    	
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("feature1");
        System.out.println("feature3");
    }
}