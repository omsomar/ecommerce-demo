package com.enterprise.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Value("${product.discount:40%}")
    private String discount;

    @GetMapping("product")
    public ResponseEntity<String> getProducts() {
        return ResponseEntity.ok("descuento: " + discount);
    }
}
