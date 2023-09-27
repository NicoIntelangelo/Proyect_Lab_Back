package com.proyect.ecommerce.controller;

import com.proyect.ecommerce.model.AppUser;

import com.proyect.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<AppUser> addUser(@RequestBody AppUser appUser){
        return ResponseEntity.ok(userService.saveUser(appUser));
    }

    @GetMapping("/all")
    public ResponseEntity<List<AppUser>> finAll(){
        return ResponseEntity.ok(userService.filAllUsers());
    }

}
