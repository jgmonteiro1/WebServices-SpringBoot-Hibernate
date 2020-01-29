 package com.jgmonteiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jgmonteiro.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
