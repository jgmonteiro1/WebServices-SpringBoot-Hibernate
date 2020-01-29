package com.jgmonteiro.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jgmonteiro.course.entities.Category;
import com.jgmonteiro.course.repositories.CategoryRepository;

@Service
public class CategoryServices {
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get(); // Retorna um objeto do itpo user que ta dentro do optional
	}
}
