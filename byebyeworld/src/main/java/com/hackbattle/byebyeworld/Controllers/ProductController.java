package com.hackbattle.byebyeworld.Controllers;

import com.hackbattle.byebyeworld.Entity.Products;
import com.hackbattle.byebyeworld.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping
    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }
    @GetMapping("/{id}")
    public Products getProductById(@PathVariable Long id) {
        return productRepository.findById(id).orElseThrow();
    }
    @PostMapping
    public Products createProduct(@RequestBody Products product) {
        return productRepository.save(product);
    }
}
