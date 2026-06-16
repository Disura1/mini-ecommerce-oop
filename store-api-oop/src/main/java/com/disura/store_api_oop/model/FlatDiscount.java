package com.disura.store_api_oop.model;

// implements (polymorphism)
public class FlatDiscount implements DiscountStrategy {

    // private = only this class can use these
    private double flatAmount;

    // constructor, runs when we make a new flat discount
    public FlatDiscount(double flatAmount) {
        this.flatAmount = flatAmount;
    }

    // Polymorphism
    @Override
    public double applyDiscount(double originalPrice) {
        double finalPrice = originalPrice - flatAmount;
        if (finalPrice < 0) {
            return 0;
        }
        return finalPrice;
    }
}