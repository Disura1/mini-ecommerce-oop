package com.disura.store_api_oop.model;

// inherits from parent
public class Customer extends Person {

    // private = only this class can use these
    private String password;

    // constructor, runs when we make a new Customer
    public Customer(String name, String email, String password) {
        super(name, email);               // inherits from parent
        this.password = password;
    }

    // getter for password
    public String getPassword() {
        return password;
    }
}