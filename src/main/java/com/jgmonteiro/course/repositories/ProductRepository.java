 package com.jgmonteiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jgmonteiro.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
