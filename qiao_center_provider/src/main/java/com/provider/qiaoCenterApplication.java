package com.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages={"com.provider.*","com.mapper.*"})
//@MapperScan(basePackages = "com.mapper.repository")
public class qiaoCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(qiaoCenterApplication.class, args);
    }
}
