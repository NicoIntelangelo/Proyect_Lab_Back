package com.proyect.ecommerce.controller;

import com.proyect.ecommerce.model.Product;
import com.proyect.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping
    public String home() {

        return "Home page";
    }
    @PostMapping()
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.saveProduct(product));
    }
}
