package com.proyect.ecommerce.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import java.util.List;

public class Product {
    @Id
    @SequenceGenerator(name = "product_sequence", sequenceName = "product_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
    private long id;
    private String brand;
    private String productName;
    private String category;
    private List<String> talles;
    private double price;
    private  int discount;
    private String image;
    private boolean newArticle;

    public Product(long id, String brand, String productName, String category, List<String> talles, double price, int discount, String image, boolean newArticle) {
        this.id = id;
        this.brand = brand;
        this.productName = productName;
        this.category = category;
        this.talles = talles;
        this.price = price;
        this.discount = discount;
        this.image = image;
        this.newArticle = newArticle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public List<String> getTalles() {
        return talles;
    }

    public void setTalles(List<String> talles) {
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