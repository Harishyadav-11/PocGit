package com.poc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.dao.UserRepo;
import com.poc.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;

	public void createUser(User user) {
		repo.save(user);
		
	}

	public Optional<User> checkValidUser(String uname, String upass) {
		return repo.find(uname, upass);
		
		
		
	}


}
