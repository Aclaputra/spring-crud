package com.spring.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.entity.Product;
import com.spring.crud.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    /**
     * Post methods
     * @param product
     * @return
     */
    public Product saveProduct(Product product) {
        return repository.save(product);
    }
    public List<Product> saveProduct(List<Product> products) {
        return repository.saveAll(products);
    }

    /**
     * Get methods
     * @return
     */
    public List<Product> getProducts() {
        return repository.findAll();
    }
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }
    /**
     * findByName not listed in library we have to make custom
     * by making new method in ProductRepository
     * @param name
     * @return
     */
    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

}