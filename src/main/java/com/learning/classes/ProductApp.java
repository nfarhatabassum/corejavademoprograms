package com.learning.classes;

public class ProductApp {
    public static void main(String[] args) {
        Product product1 = new Product();
       Product product2 = new Product(102,"HeadPhones",2500);
       Product[] products = {product1,product2};
       displayProductDetails(products);
    }

    private static void displayProductDetails(Product[] products) {
        for (Product product:products) {
            System.out.println(product.getProductDetails());
        }
    }
}
