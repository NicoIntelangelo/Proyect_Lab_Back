package com.proyect.ecommerce.service;

import com.proyect.ecommerce.model.AppUser;
import com.proyect.ecommerce.model.Product;
import com.proyect.ecommerce.repository.impl.ProductRepository;
import com.proyect.ecommerce.repository.impl.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    private UserRepository userRepository;
    private ProductRepository productRepository;

    @Autowired
    public DataLoader(UserRepository userRepository,ProductRepository  productRepository) {
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }



    public void run(ApplicationArguments args){
        userRepository.save(new AppUser( "diego", "diego","diego@digital.com","password"));
        productRepository.save(new Product("Nike","Air Max","zapatillas","",120.3,10,"https://acdn.mitiendanube.com/stores/219/431/products/0e082e5e-89b7-42b1-8345-f5ed47cda4f1-9e3142af1b2532f74916990234852226-480-0.webp",true));
        productRepository.save(new Product("Nike","Jordan 1","zapatillas","",16600.3,15,"https://acdn.mitiendanube.com/stores/219/431/products/0e082e5e-89b7-42b1-8345-f5ed47cda4f1-9e3142af1b2532f74916990234852226-480-0.webp",false));
        productRepository.save(new Product("Adidas","Run","remeras","",13220.3,0,"https://acdn.mitiendanube.com/stores/219/431/products/0e082e5e-89b7-42b1-8345-f5ed47cda4f1-9e3142af1b2532f74916990234852226-480-0.webp",false));
        productRepository.save(new Product("Nike","Basquet","remeras","",12220.3,20,"https://acdn.mitiendanube.com/stores/219/431/products/0e082e5e-89b7-42b1-8345-f5ed47cda4f1-9e3142af1b2532f74916990234852226-480-0.webp",false));
        productRepository.save(new Product("Fila","concept","buzos","",60020.3,15,"https://acdn.mitiendanube.com/stores/219/431/products/0e082e5e-89b7-42b1-8345-f5ed47cda4f1-9e3142af1b2532f74916990234852226-480-0.webp",true));
        productRepository.save(new Product("Nike","Jordan","buzos","",12110.3,5,"https://acdn.mitiendanube.com/stores/219/431/products/0e082e5e-89b7-42b1-8345-f5ed47cda4f1-9e3142af1b2532f74916990234852226-480-0.webp",false));
        productRepository.save(new Product("Adidas","Harden","remeras","",12220.3,8,"https://acdn.mitiendanube.com/stores/219/431/products/0e082e5e-89b7-42b1-8345-f5ed47cda4f1-9e3142af1b2532f74916990234852226-480-0.webp",true));
        productRepository.save(new Product("Adidas","Runing","zapatillas","",18220.3,8,"https://acdn.mitiendanube.com/stores/219/431/products/0e082e5e-89b7-42b1-8345-f5ed47cda4f1-9e3142af1b2532f74916990234852226-480-0.webp",true));
        productRepository.save(new Product("Adidas","Harden","remeras","",12220.3,0,"https://acdn.mitiendanube.com/stores/219/431/products/0e082e5e-89b7-42b1-8345-f5ed47cda4f1-9e3142af1b2532f74916990234852226-480-0.webp",true));
        productRepository.save(new Product("Adidas","Runing","zapatillas","",18220.3,0,"https://acdn.mitiendanube.com/stores/219/431/products/0e082e5e-89b7-42b1-8345-f5ed47cda4f1-9e3142af1b2532f74916990234852226-480-0.webp",true));
    }
}
