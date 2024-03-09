package com.oliveiraz.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiraz.practice.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
