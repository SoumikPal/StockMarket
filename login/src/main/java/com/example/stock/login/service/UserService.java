package com.example.stock.login.service;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.example.stock.login.model.Signup;
import com.example.stock.login.model.User;  
import com.example.stock.login.repository.UserRepository;  
//defining the business logic  
@Service  

public class UserService {
	
	@Autowired  
	UserRepository userRepository;
	public Boolean checkLogin(User ur)
	{
		return true;
	}
	public Boolean addNew(Signup signup)
	{
		return true;
		
	}

}

