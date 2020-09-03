package com.example.stock.login.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.login.model.Contact; 
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>  
{
	
}
