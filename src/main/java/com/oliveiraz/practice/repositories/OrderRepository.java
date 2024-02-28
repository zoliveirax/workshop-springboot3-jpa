package com.oliveiraz.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiraz.practice.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
