package com.viniciusdev.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusdev.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
