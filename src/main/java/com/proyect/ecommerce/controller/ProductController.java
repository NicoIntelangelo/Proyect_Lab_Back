package com.proyect.ecommerce.controller;

import com.proyect.ecommerce.model.Product;
import com.proyect.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() { return ResponseEntity.ok(productService.findAllProduct()); }

    // Devuelve una lista de productos que son newArticle
    @GetMapping
    public ResponseEntity<List<Product>> findNews() { return ResponseEntity.ok(productService.findNewArticles(true)); }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Integer id) {
        Product product = productService.find(id).orElse(null);

        return ResponseEntity.ok(product);
    }

    // Devuelve una lista de productos según la categoría que le llega por el path
    @GetMapping("/{category}")
    public List<Product> findByCategory(@PathVariable String category) {
        return productService.findByC(category);
    }

    @PutMapping()
    public ResponseEntity<Product> edit(@RequestBody Product product) {
        ResponseEntity<Product> response = null;

        if (product.getId() != null && productService.find(product.getId()).isPresent())
            response = ResponseEntity.ok(productService.update(product));
        else
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return response;
    }

    @PostMapping()
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.saveProduct(product));
    }


}
