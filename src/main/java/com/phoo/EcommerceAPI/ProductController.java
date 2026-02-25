package com.phoo.EcommerceAPI;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/product-list")
public class ProductController {

    /// For Mini Database
    private final List<Product> productList = new ArrayList<>(
            List.of(
                new Product(
                         1,
                        "iPhone 15 pro",
                        1299.99,
                        "Electronics",
                        15
                ),
                new Product(
                        2,
                        "Samsung Galaxy S24",
                        1099.99,
                        "Electronics",
                        20
                ),
                new Product(
                        3,
                        "Nike Air Max",
                        180.00,
                        "Fashion",
                        30
                ),
                new Product(
                         4,
                         "MacBook Air M3",
                        1399.00,
                         "Electronics",
                         8
                )
            )
    );

    /// Get or Show all list
    @GetMapping
    public List<Product> getProductList(){
        return productList;
    }

    /// Add new Product
    @PostMapping
    public void addProduct(@RequestBody Product product){
        productList.add(product);
    }

    /// Update Product
    @PutMapping("/{id}")
    public void updateProdcut(
            @PathVariable int id,
            @RequestBody Product updateProduct
    ){
        for(Product product:productList){
            if(product.getId() == id){
                product.setName(updateProduct.getName());
                product.setPrice(updateProduct.getPrice());
                product.setCategory(updateProduct.getCategory());
                product.setStock(updateProduct.getStock());
            }
        }
    }

    /// Delete Product
    @DeleteMapping("/{id}")
    public void deleteProduct(
            @PathVariable int id
    ){
        productList.removeIf(product -> product.getId() == id);
    }

}
