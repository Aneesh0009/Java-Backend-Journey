package com.aneesh.webApp.model;

public class Product {
    private int id;
    private String productName;
    private String productPrice;
    public Product(int id, String productName, String productPrice) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getID() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setID(int ID) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}
