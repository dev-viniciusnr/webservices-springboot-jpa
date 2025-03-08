package com.viniciusdev.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusdev.projeto.entities.OrderItem;
import com.viniciusdev.projeto.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
