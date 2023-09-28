package com.proyect.ecommerce.service;


import com.proyect.ecommerce.model.Product;
import com.proyect.ecommerce.repository.impl.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){this.productRepository = productRepository;}

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public Optional<Product> find(Integer id) { return productRepository.findById(id); }

    // Usa el findByNewArticle que creé en el repositorio y le pasa la propiedad newArticle
    public List<Product> findNewArticles(Boolean newArticle) { return productRepository.findByNewArticle(newArticle); }

    // Usa el findByCategory() que creé en el repositorio y le pasa una categoría
    public List<Product> findByC(String category) { return productRepository.findByCategory(category); }

    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    public Product update(Product product){ return productRepository.save(product); }
}
