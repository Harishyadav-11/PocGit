package com.poc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poc.model.Admin;
import com.poc.service.AdminService;

@Controller
@RequestMapping("/onlineExam")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("Admin")
	public String admin() {
		return "AdminLoginPage";
		
	}
	
	@RequestMapping("AdminRegForm")
	public String adminRegForm() {
		return "AdminRegForm";
	}
	
	
	@RequestMapping("addAdminDetails")
	public String addAdminDetails(Admin admin) {
		
		adminService.addAdmin(admin);
		
		
		return "NewAdmin";
		
	}
	
	@RequestMapping("adminLogin")
	public String adminLogin(@RequestParam("admin_email") String uname, @RequestParam("admin_password") String upass) {
		
		Optional<Admin> admin = adminService.checkValidadmin(uname, upass);
		if(admin.isPresent()) {
			
			return "CheckValidAdmin";
		}
		else {
			return "InvalidAdmin";
		}		
		
	}
		

}

