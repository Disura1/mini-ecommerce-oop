package com.disura.store_api_oop.model;

// this is abstract class
public abstract class PaymentMethod {

    protected double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    // abstract
    public abstract void processPayment();

    // normal method
    public void printReceipt() {
        System.out.println("Receipt: $" + amount + " paid.");
    }
}