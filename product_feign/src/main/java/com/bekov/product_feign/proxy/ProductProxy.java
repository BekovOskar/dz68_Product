package com.bekov.product_feign.proxy;

import com.bekov.product_feign.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("product-api")
public interface ProductProxy {
    @GetMapping("/product/{id}")
    Product getProductbyId(@PathVariable("id") int id);

    @GetMapping("/product")
    List<Product> getProduct();
}
