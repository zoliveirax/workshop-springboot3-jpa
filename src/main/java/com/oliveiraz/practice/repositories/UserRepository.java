package com.oliveiraz.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiraz.practice.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
