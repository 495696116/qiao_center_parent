package com.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages={"com.*"})
@MapperScan(basePackages = "com.mapper.dao")
public class qiaoCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(qiaoCenterApplication.class, args);
    }
}
