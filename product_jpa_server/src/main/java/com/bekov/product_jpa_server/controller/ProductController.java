package com.bekov.product_jpa_server.controller;

import com.bekov.product_jpa_server.model.Product;
import com.bekov.product_jpa_server.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/product/{id}")
    public Product getProductbyId(@PathVariable("id") int id){
        return productRepository.findById(id).orElse(new Product());
    }

    @GetMapping("/product")
    public List<Product> getProduct(){
        return productRepository.findAll();
    }

    @PostMapping("/product")
    public Product setProduct(@RequestBody Product produst){
        return productRepository.save(produst);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable("id") int id){
        productRepository.deleteById(id);
    }
}
