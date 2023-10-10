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
        productRepository.save(new Product("Nike","Air Max","zapatillas",true,120.3,10,"image",true));
        productRepository.save(new Product("Nike","Jordan 1","zapatillas",true,16600.3,15,"image",false));
        productRepository.save(new Product("Adidas","Run","remeras",true,13220.3,0,"image",false));
        productRepository.save(new Product("Nike","Basquet","remeras",true,12220.3,20,"image",false));
        productRepository.save(new Product("Fila","concept","buzos",true,60020.3,15,"image",true));
        productRepository.save(new Product("Nike","Jordan","buzos",true,12110.3,5,"image",false));
        productRepository.save(new Product("Adidas","Harden","remeras",true,12220.3,8,"image",true));
        productRepository.save(new Product("Adidas","Runing","zapatillas",true,18220.3,8,"image",true));
        productRepository.save(new Product("Adidas","Harden","remeras",true,12220.3,0,"image",true));
        productRepository.save(new Product("Adidas","Runing","zapatillas",true,18220.3,0,"image",true));
    }
}
