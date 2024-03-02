package com.oliveiraz.practice.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.oliveiraz.practice.entities.Category;
import com.oliveiraz.practice.entities.Order;
import com.oliveiraz.practice.entities.User;
import com.oliveiraz.practice.entities.enums.OrderStatus;
import com.oliveiraz.practice.repositories.CategoryRepository;
import com.oliveiraz.practice.repositories.OrderRepository;
import com.oliveiraz.practice.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	//injeção de dependência//
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		User u1 = new User(null, "Alex Silva", "alex@gmail.com", "983348888", "123456");
		User u2 = new User(null, "Julio Oliveira", "julio@gmail.com", "977132777", "123456"); 
		
		Order o1 = new Order(null, Instant.parse("2024-03-20T19:53:07Z"),OrderStatus.DELIVERED, u1);
		Order o2 = new Order(null, Instant.parse("2024-02-21T03:42:10Z"),OrderStatus.PAID, u2);
		Order o3 = new Order(null, Instant.parse("2024-01-22T15:21:22Z"),OrderStatus.SHIPPED, u1);

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}

}
