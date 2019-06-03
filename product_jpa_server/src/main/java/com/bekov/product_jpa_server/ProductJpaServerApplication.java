package com.bekov.product_jpa_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductJpaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductJpaServerApplication.class, args);
    }

}
