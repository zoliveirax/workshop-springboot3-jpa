package com.oliveiraz.practice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oliveiraz.practice.entities.User;
import com.oliveiraz.practice.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	//esta anotação injeta o UserResource na classe UserService (Injeção de dependência)//
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	//Requisição tipo GET//
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	

}
