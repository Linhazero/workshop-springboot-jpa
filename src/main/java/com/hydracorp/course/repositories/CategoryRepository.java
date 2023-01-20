package com.hydracorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hydracorp.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
