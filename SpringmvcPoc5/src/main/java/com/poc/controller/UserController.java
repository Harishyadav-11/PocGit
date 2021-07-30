package com.poc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poc.dao.UserRepo;
import com.poc.model.User;
import com.poc.service.UserService;

@Controller
@RequestMapping("/onlineExam")
public class UserController {
	@Autowired
	private UserService service;
	
	@Autowired
	private UserRepo repo;
	
	// display home page
	
	@GetMapping("/home")
	public String home() {
		return "Home";
		
	}
	
	// display login form
	
	@GetMapping("/Login")
	public String login() {
		return "Login";
		
	}
	// display user registration form
	
	@GetMapping("/User")
	public String newUser() {
		return "User";
		
	}

	
	// add User Details to data base
	
	@RequestMapping("/addUser")
	public String addUser( User user) {
		
		service.createUser(user);
		return "NewRegister";
		
	}
	
	// check valid user or not
	
	@RequestMapping("login")
	public String validUser(@RequestParam("user_email") String uname, @RequestParam("user_password") String upass, Model map) {
		
		Optional<User> user = service.checkValidUser(uname, upass);
		if(user.isPresent()) {
			
			return "CheckUser";
		}
		else {
			return "Invaliduser";
		}
		
	
	
	}
	
	

}

