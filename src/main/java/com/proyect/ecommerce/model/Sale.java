package com.proyect.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "sales")
public class Sale {

    @Id
    private Integer id;
    private Date date;
    //private AppUser user;
    
    // private Set<Product> productos = new HashSet<>();

}
