package com.example.stock.login.repository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.stock.login.model.User;

import java.util.*;
public interface UserRepository extends CrudRepository<User, Integer>  
{
	@Query("SELECT p FROM User p WHERE p.userName = (:userName)")
    public List<User> fetchByUserName(@Param("userName") String userName);
	
}  
