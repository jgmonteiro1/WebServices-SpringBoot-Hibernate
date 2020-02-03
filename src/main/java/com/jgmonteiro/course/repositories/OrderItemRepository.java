 package com.jgmonteiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jgmonteiro.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
