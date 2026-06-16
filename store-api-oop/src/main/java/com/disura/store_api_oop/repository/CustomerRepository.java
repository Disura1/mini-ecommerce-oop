package com.disura.store_api_oop.repository;

import com.disura.store_api_oop.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}