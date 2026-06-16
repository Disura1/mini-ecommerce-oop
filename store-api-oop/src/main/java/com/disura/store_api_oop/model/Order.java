package com.disura.store_api_oop.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    // private = only this class can use these
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    private List<Product> products;

    @Transient
    private DiscountStrategy discountStrategy;

    protected Order() {
    }

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

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }
}