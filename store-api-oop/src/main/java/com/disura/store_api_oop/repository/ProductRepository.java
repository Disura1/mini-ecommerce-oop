package com.disura.store_api_oop.repository;

import com.disura.store_api_oop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}