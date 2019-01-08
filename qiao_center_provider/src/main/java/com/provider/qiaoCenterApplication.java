package com.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class qiaoCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(qiaoCenterApplication.class, args);
    }
}
