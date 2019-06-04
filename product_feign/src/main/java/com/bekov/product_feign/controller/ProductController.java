package com.bekov.product_feign.controller;

import com.bekov.product_feign.model.Product;
import com.bekov.product_feign.proxy.ProductProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductProxy productProxy;

    @GetMapping("/find-product/{id}")
    public Product getProductbyId(@PathVariable("id") int id){

        return productProxy.getProductbyId(id);
    }

    @GetMapping("/find-product")
    public List<Product> getProduct(){

        return productProxy.getProduct();

    }
}
