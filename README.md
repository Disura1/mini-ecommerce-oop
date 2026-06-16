# Mini E-Commerce OOP

A small e-commerce backend built to practice and show core OOP concepts in Java, using Spring Boot and MySQL.

## Why this project exists

I built this after feedback that my previous project leaned too much on frameworks (Lombok, Spring) and didn't clearly show OOP concepts like encapsulation, inheritance, polymorphism, and object collaboration. This project focuses on writing those concepts by hand so they are easy to see and explain.

## What I built so far

**Encapsulation**
- `Product` keeps its fields private and only allows stock changes through a `reduceStock()` method, which checks if enough stock is available before changing anything.

**Inheritance**
- `Person` is a shared parent class with `name` and `email`.
- `Customer` extends `Person` and adds a `password` field.

**Polymorphism (interface based)**
- `DiscountStrategy` is an interface with one method, `applyDiscount()`.
- `FlatDiscount` and `PercentageDiscount` both implement it differently.

**Polymorphism (abstract class based)**
- `PaymentMethod` is an abstract class with a shared `printReceipt()` method and an abstract `processPayment()` method.
- `CreditCardPayment` and `CashPayment` each implement `processPayment()` in their own way.

**Object collaboration**
- `Order` holds a `Customer` and a list of `Product` objects.
- `Order.addProduct()` and `Order.setDiscountStrategy()` show objects being created elsewhere and passed into another object.
- `Order.calculateTotal()` asks each `Product` for its price and then hands the total to a `DiscountStrategy` object to apply the discount.

**Database connection**
- `Product`, `Customer`, and `Order` are connected to MySQL using Spring Data JPA.
- `Customer extends Person` uses `@MappedSuperclass` so inheritance still works with the database.
- `Order` has a `@ManyToOne` link to `Customer` and a `@ManyToMany` link to `Product`.
- The `DiscountStrategy` field in `Order` is marked `@Transient`, since it is logic, not data to be stored.

## Tech used

- Java 22, Spring Boot 4
- Spring Data JPA
- MySQL (via XAMPP)
- Maven

## Future plan

- Add a Service layer that uses these objects together, like a `CheckoutService` that creates an order, applies a discount, and reduces stock in one step.
- Add REST Controllers so this becomes a real API (similar to my other e-commerce project).
- Maybe add one more polymorphism example, like different customer types (regular vs VIP) with different discount rules.

## Note

This project is still in progress. The goal right now is to clearly show OOP concepts with real, working code, not to be a finished production app yet.