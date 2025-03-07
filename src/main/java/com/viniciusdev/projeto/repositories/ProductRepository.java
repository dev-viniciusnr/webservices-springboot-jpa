package com.viniciusdev.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusdev.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
