package com.poc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.dao.QuestionRepo;
import com.poc.model.Questions;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepo quationRepo;

	public void addQuations(Questions quation) {
		
		quationRepo.save(quation);
		
	}

	public Optional<Questions> deleteQuationById(int id) {
		return quationRepo.findById(id);
		
	
	}
}




