package com.proyect.ecommerce.service;


import com.proyect.ecommerce.model.AppUser;
import com.proyect.ecommerce.model.Product;
import com.proyect.ecommerce.repository.impl.ProductRepository;
import com.proyect.ecommerce.repository.impl.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){this.productRepository = productRepository;}

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }
}
