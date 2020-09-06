package com.example.stock.login.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  
import com.example.stock.login.model.User;
import com.example.stock.login.service.JWTUserService;
//import com.example.stock.login.service.UserService;
import com.example.stock.login.model.Contact;
import com.example.stock.login.model.Signup;
//creating RestController  
@CrossOrigin()
@RestController
//@RequestMapping("/users")
public class UserController  
{
	
	@Autowired  
	private JWTUserService userService;
	
	@GetMapping("/welcome")
	public String Welcome()
	{
		return "Welcome user,Login or Signup";
	}
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/welcomeAdmin")
	public String WelcomeAdmin()
	{
		return "Welcome Admin";
	}
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/welcomeUser")
	public String WelcomeUser()
	{
		return "Welcome User";
	}
	/*@GetMapping("/login")
	public ResponseEntity <Boolean> Login(@RequestBody User user) {
		  Boolean isvalid = userService.checkLogin(user);
		  return new ResponseEntity <Boolean> (isvalid, HttpStatus.OK);
		 }
	@GetMapping("/signup")
	public ResponseEntity <Boolean> Signup(@RequestBody Signup signup) {
		  Boolean isvalid = userService.addNew(signup);
		  return new ResponseEntity <Boolean> (isvalid, HttpStatus.OK);
		 }*/
	
	
	
	
	
	
	

}  

