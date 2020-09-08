package com.example.stock.login.service;

import org.springframework.beans.factory.annotation.Autowired; 
import com.example.stock.login.service.UserDetailsImpl; 
import org.springframework.stereotype.Service;

import com.example.stock.login.model.Contact;
import com.example.stock.login.model.Signup;
import com.example.stock.login.model.User;
import com.example.stock.login.repository.ContactRepository;
import com.example.stock.login.repository.UserRepository;  
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service  

public class JWTUserService implements UserDetailsService{
	
	@Autowired  
	private UserRepository userRepository;
	@Autowired  
	private ContactRepository contactRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		Optional<User> user = userRepository.findByUserName(userName);

		user.orElseThrow(() -> new UsernameNotFoundException(userName + " not found."));

		return user.map(UserDetailsImpl::new).get();
	}
	public User getUserByUsername(String username) {
		Optional<User> user = userRepository.findByUserName(username);
		User ur=user.orElse(null);

		return ur;
	}
	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		userRepository.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	
	public void delete(Integer id) {
		userRepository.deleteById(id);
	}


	
	public User findById(Integer id) {
		return userRepository.findById(id).get();
	}

	
    public Contact save(Contact contact) {
	     User user= contact.getUser();
	     user.setPassword(passwordEncoder.encode(user.getPassword()));
	     contact.setUser(user);
        return contactRepository.save(contact);
    }
    
    
}
	



