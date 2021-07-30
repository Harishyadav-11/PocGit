package com.poc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poc.dao.QuestionRepo;
import com.poc.model.Questions;
import com.poc.service.QuestionService;

@Controller
@RequestMapping("/onlineExam")
public class QuestionController {
	@Autowired
	private QuestionService quationService;
	
	@Autowired
	private QuestionRepo repo;
	
	@RequestMapping("QuationFormAdd")
	public String quationForm() {
		return "QuationFormAdd";
		
	}
	
	@RequestMapping("DeleteForm")
	public String deleteForm() {
		return "DeleteForm";
		
	}
	
	@RequestMapping("addQuations")
	public String addQuations(Questions quation) {
		quationService.addQuations(quation);
		return "AddQuations";
	}
	
	@RequestMapping("DeleteSuccess")
	public String deleteQuationById(@RequestParam("quation_id") int id) {
		Optional<Questions> qua = quationService.deleteQuationById(id);
		if(qua.isPresent()) {
	    	 repo.delete(qua.get());
	         return "DeleteSuccess";
	     }
	     else {
	         return "DeleteFail";
	     }
		
	}
	
	
	@RequestMapping("NewFile")
	public String quationForm1() {
		return "NewFile";
		
	}


}


