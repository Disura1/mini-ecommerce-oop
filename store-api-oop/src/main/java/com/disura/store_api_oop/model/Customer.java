package com.disura.store_api_oop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// inherits from parent
@Entity
public class Customer extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // private = only this class can use these
    private String password;

    protected Customer() {
    }

    // constructor, runs when we make a new Customer
    public Customer(String name, String email, String password) {
        super(name, email);               // inherits from parent
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    // getter for password
    public String getPassword() {
        return password;
    }
}