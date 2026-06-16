package com.disura.store_api_oop.model;

// abstract
public class CashPayment extends PaymentMethod {

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing cash payment of $" + amount);
    }
}