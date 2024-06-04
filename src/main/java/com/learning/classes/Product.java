package com.learning.classes;

public class Product {
    int productId;
    String productName;
    double productPrice;

    Product(){ //Default constructor
        System.out.println("It intializes the instance variables");
        this.productId = 101;
        this.productName = "Laptop";
        this.productPrice = 45000;
    }
//Parameterized constructor

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public Product(int productId, String productName, double productPrice) {
//        this.productId = productId;
//        this.productName = productName;
        this(productId,productName);
        this.productPrice = productPrice;
    }

    public String getProductDetails() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
