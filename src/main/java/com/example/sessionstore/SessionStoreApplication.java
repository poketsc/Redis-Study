package com.example.sessionstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SessionStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SessionStoreApplication.class, args);
    }

}
