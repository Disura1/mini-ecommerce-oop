package com.disura.store_api_oop.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    // private = only this class can use these
    private Customer customer;
    private List<Product> products;
    private DiscountStrategy discountStrategy;

    // constructor, runs when we make a new Order
    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.discountStrategy = null;
    }

    // object moving
    public void addProduct(Product product) {
        this.products.add(product);
    }

    // polymorphism (Discount Strategy ==> FlatDiscount or DiscountStrategy) with object moving
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total = total + product.getPrice();
        }

        if (discountStrategy != null) {
            total = discountStrategy.applyDiscount(total);
        }

        return total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }
}