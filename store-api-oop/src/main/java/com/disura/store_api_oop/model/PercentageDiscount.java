package com.disura.store_api_oop.model;

// implements (polymorphism)
public class PercentageDiscount implements DiscountStrategy {

    // private = only this class can use these
    private double percentage;

    // constructor, runs when we make a new Percentage Discount
    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    // Polymorphism
    @Override
    public double applyDiscount(double originalPrice) {
        double discountAmount = originalPrice * (percentage / 100);
        return originalPrice - discountAmount;
    }
}