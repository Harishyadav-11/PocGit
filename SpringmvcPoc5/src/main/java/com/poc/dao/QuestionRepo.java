package com.poc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.model.Questions;

@Repository
public interface QuestionRepo extends JpaRepository<Questions, Integer>  {

}
