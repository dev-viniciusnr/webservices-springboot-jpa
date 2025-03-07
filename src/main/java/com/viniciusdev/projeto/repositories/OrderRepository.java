package com.viniciusdev.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusdev.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
