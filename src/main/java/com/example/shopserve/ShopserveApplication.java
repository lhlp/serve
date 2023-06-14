package com.example.shopserve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.example")
@SpringBootApplication
public class ShopserveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopserveApplication.class, args);
    }

}
