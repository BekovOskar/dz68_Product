package com.bekov.product_rest_template.controller;

import com.bekov.product_rest_template.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @GetMapping("/find-product/{id}")
    public Product getProductbyId(@PathVariable("id") int id){
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        return new RestTemplate().getForObject("http://localhost:9090/product/{id}",Product.class,params);
    }

    @GetMapping("/find-product")
    public List<Product> getProduct(){
        List<Product> products = new ArrayList<>();
        return new RestTemplate().getForObject("http://localhost:9090/product/{id}",products.getClass());

    }
}
