package com.spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.entity.Product;
import com.spring.crud.service.ProductService;

@RestController
public class ProductController {
    
    /**
     * @Autowired ProductService
     * nyambung dengan function function pada ProductService.java
     */
    @Autowired
    private ProductService service;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    } 
    @PostMapping("/addproducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    } 
    
}