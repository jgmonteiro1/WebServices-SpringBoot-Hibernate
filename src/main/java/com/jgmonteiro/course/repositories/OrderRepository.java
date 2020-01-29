package com.jgmonteiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jgmonteiro.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
