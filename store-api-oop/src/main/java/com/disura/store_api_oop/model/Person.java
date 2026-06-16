package com.disura.store_api_oop.model;

public class Person {

    // protected = locked, only Person and its children can use these
    protected String name;
    protected String email;

    // constructor, runs when we make a new person
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // getter for email
    public String getEmail() {
        return email;
    }
}