package com.viniciusdev.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusdev.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
