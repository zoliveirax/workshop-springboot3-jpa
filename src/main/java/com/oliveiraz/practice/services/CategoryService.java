package com.oliveiraz.practice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oliveiraz.practice.entities.Category;
import com.oliveiraz.practice.repositories.CategoryRepository;

//identifica esta classe como um serviço//
@Service
public class CategoryService {
	 
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
		
	}

}
