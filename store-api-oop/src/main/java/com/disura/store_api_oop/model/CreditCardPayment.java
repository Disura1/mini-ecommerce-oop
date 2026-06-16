package com.disura.store_api_oop.model;

// abstract
public class CreditCardPayment extends PaymentMethod {

    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $" + amount + " using card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}