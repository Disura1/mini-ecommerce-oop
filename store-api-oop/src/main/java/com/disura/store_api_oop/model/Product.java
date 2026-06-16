package com.disura.store_api_oop.model;

public class Product {

    // private = only this class can use these
    private String name;
    private double price;
    private int stockQuantity;

    // constructor, runs when we make a new Product
    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // getter, just lets us read the name
    public String getName() {
        return name;
    }

    // getter for price
    public double getPrice() {
        return price;
    }

    // getter for stock
    public int getStockQuantity() {
        return stockQuantity;
    }

    // change stock only through this method, with a check
    public void reduceStock(int quantity) {
        if (quantity > this.stockQuantity) {
            throw new IllegalArgumentException("Not enough stock for "+this.name);
        }
        this.stockQuantity = this.stockQuantity - quantity;
    }
}
