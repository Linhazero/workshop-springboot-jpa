package com.hydracorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hydracorp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
