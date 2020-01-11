 package com.jgmonteiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jgmonteiro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
