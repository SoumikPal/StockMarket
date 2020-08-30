package com.example.stock.login.repository;
import org.springframework.data.repository.CrudRepository;  
import com.example.stock.login.model.Contact; 
public interface ContactRepository extends CrudRepository<Contact, Integer>  
{
	
}
