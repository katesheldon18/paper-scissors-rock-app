package com.paperscissorsrock.repository;

// https://docs.spring.io/spring-data/jpa/reference/repositories/definition.html
 
import org.springframework.data.jpa.repository.JpaRepository;
import com.paperscissorsrock.entity.User;

// comes with built-in methods (CRUD)
public interface UserRepository extends JpaRepository<User, Long> {}