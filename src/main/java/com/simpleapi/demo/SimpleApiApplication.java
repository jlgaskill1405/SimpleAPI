package com.simpleapi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.simpleapi.demo.repository")
public class SimpleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleApiApplication.class, args);
    }

}
