package com.disura.store_api_oop.repository;

import com.disura.store_api_oop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}