package com.proyect.ecommerce.repository.impl;


import com.proyect.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCategory(String category);
    List<Product> findByNewArticle(boolean newArticle);
}
