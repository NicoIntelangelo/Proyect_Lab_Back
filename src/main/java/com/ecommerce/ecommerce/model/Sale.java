package com.ecommerce.ecommerce.model;

import jakarta.persistence.*;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sales")
public class Sale {

    @Id
    private Integer id;
    private Date date;
    private User user;
    private Set<Product> productos = new HashSet<>();

}
