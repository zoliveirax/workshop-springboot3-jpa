package com.oliveiraz.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiraz.practice.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
