package com.bekov.product_naming_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProductNamingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductNamingServerApplication.class, args);
    }

}
