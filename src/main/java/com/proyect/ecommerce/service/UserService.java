package com.proyect.ecommerce.service;

import com.proyect.ecommerce.model.AppUser;

import com.proyect.ecommerce.repository.impl.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) { this.userRepository = userRepository; }

    @Override
    public UserDetails loadUserByUsername(String email) { return userRepository.findByEmail(email).get(); }

    public AppUser saveUser(AppUser user){
        return userRepository.save(user);
    }

    public List<AppUser> filAllUsers() {
        return userRepository.findAll();
    }
}
