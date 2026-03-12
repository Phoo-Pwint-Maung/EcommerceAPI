package com.phoo.EcommerceAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.annotation.PostConstruct; // Spring Boot 3.x အတွက်
import java.util.TimeZone;

@SpringBootApplication
public class EcommerceApiApplication {

//    @PostConstruct
//    public void init() {
//
//        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
//    }

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApiApplication.class, args);
    }
}