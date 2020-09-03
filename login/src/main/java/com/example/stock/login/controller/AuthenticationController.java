package com.example.stock.login.controller;

import com.example.stock.login.config.TokenProvider;

import com.example.stock.login.model.AuthToken;
import com.example.stock.login.model.Contact;
import com.example.stock.login.model.LoginUser;
import com.example.stock.login.model.Signup;
import com.example.stock.login.model.User;
import com.example.stock.login.repository.UserRepository;
import com.example.stock.login.service.JWTUserService;
import com.example.stock.login.service.UserDetailsImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import static com.example.stock.login.model.Constants.TOKEN_PREFIX;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenProvider jwtTokenUtil;
    
    @Autowired  
	private JWTUserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public ResponseEntity<?> register(@RequestBody LoginUser loginUser) throws AuthenticationException {
    	User ur=userService.getUserByUsername(loginUser.getUsername());
        final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginUser.getUsername(),
                        loginUser.getPassword()
                )
        );
    	
        //return ResponseEntity.ok(ur==null?"Yes":ur.getUserName());
    	//return ResponseEntity.ok(loginUser.getUsername());
        
        SecurityContextHolder.getContext().setAuthentication(authentication);
        final String token = jwtTokenUtil.generateToken(authentication);
        return ResponseEntity.ok(new AuthToken(token));
    }
    @PostMapping("/signup")
	public ResponseEntity<String> signup(@RequestBody Signup signup) {
    
		User u = userService.getUserByUsername(signup.getUserName());
        if(u == null) {
        	User newuser=new User();
        	newuser.setUserName(signup.getUserName());
        	newuser.setPassword(signup.getPassword());
        	newuser.setUserType("ROLE_USER");
        	newuser.setConfirmed(1);
        	//userService.save(newuser);
        	Contact ob=new Contact();
        	ob.setCity(signup.getCity());
        	ob.setEmail(signup.getEmail());
        	ob.setPhone(signup.getPhone());
        	ob.setState(signup.getState());
        	ob.setZip(signup.getZip());
            ob.setUser(newuser);
            newuser.setContact(ob);
            Contact ob1=userService.save(ob);
            
        	//userService.savecontact(ob);
        	
			return new ResponseEntity<String>(ob1.toString(), HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("User already exists", HttpStatus.CONFLICT);
		}
	}
    @GetMapping("/signup")
    public String signup()
    {
    	return "Hello";
    }
    

}
