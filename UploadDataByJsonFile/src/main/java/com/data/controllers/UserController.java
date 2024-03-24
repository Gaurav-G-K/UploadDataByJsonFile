package com.data.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.dto.AuthResponse;
import com.data.dto.Login;
import com.data.repositry.UserRepo;
import com.data.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private UserServices userServices;
	
//	@PostMapping("/user")
//	public Users addUser(@RequestBody Users user) {
//		user.setPassword(passwordEncoder.encode(user.getPassword()));
//		return userRepo.save(user);
//		
//	}

	@PostMapping("/signin")	
	public ResponseEntity<AuthResponse> getLoggedIn(@RequestBody Login login)
	{
		System.out.println("Hellokjnhbj");
		 return  new ResponseEntity<>(userServices.loginUser(login),HttpStatus.OK);

	}

}
