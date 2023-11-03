package com.proyect.ecommerce.model;

import jakarta.persistence.*;
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    private String brand;
    private String productName;
    private String category;
    private String talles;
    private double price;
    private  int discount;
    private String image;
    private boolean newArticle;


    public Product() {
    }

    public Product(String brand, String productName, String category, String talles, double price, int discount, String image, boolean newArticle) {
        this.brand = brand;
        this.productName = productName;
        this.category = category;
        this.talles = talles;
        this.price = price;
        this.discount = discount;
        this.image = image;
        this.newArticle = newArticle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTalles() {
        return talles;
    }

    public void setTalles(String talles) {
        this.talles = talles;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isNewArticle() {
        return newArticle;
    }

    public void setNewArticle(boolean newArticle) {
        this.newArticle = newArticle;
    }
}