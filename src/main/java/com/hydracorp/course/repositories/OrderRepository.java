package com.hydracorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hydracorp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
