package com.oliveiraz.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiraz.practice.entities.OrderItem;
import com.oliveiraz.practice.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
