package com.phoo.EcommerceAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    // Constructor Injection
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Product find all
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Product create
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}