package com.jgmonteiro.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jgmonteiro.course.entities.User;
import com.jgmonteiro.course.repositories.UserRepository;

@Service
public class UserServices {
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get(); // Retorna um objeto do itpo user que ta dentro do optional
	}

	public User insert(User obj) {
		return repository.save(obj);
	}
}
