package com.oliveiraz.practice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oliveiraz.practice.entities.Order;
import com.oliveiraz.practice.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	
	//esta anotação injeta o OrderResource na classe OrderService (Injeção de dependência)//
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	//Requisição tipo GET//
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	

}
