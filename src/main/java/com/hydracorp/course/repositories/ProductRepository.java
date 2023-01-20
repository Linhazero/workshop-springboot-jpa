package com.hydracorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hydracorp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
