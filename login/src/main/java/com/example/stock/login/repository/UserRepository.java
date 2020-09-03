package com.example.stock.login.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.stock.login.model.User;

import java.util.*;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>  
{
	@Query("SELECT p FROM User p WHERE p.userName = (:userName)")
    public List<User> fetchByUserName(@Param("userName") String userName);
	
	Optional<User> findByUserName(String userName);
	
}  
