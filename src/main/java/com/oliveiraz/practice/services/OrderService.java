package com.oliveiraz.practice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oliveiraz.practice.entities.Order;
import com.oliveiraz.practice.repositories.OrderRepository;

//identifica esta classe como um serviço//
@Service
public class OrderService {
	 
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
		
	}

}
