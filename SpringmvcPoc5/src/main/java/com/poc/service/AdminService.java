package com.poc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.dao.AdminRepo;
import com.poc.model.Admin;

@Service
public class AdminService {
	@Autowired
	private AdminRepo repo;

	public void addAdmin(Admin admin) {
		
		repo.save(admin);
		
		
	}

	public Optional<Admin> checkValidadmin(String uname, String upass) {
		
		return repo.find(uname, upass);
	}

}


