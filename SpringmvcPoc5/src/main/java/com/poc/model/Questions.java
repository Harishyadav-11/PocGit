package com.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="question_paper")
public class Questions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int question_id;
	
	@Column(name="name")
	private String question_name;
	
	@Column(name="option_A")
	private String option_1;
	
	@Column(name="option_B")
	private String option_2;
	
	@Column(name="option_C")
	private String option_3;
	
	@Column(name="option_D")
	private String option_4;
	
	@Column(name="correct_answer")
	private String correct_option;
	
	public Questions() {
		super();
	}

	public Questions(int question_id, String question_name, String option_1, String option_2, String option_3,
			String option_4, String correct_option) {
		super();
		this.question_id = question_id;
		this.question_name = question_name;
		this.option_1 = option_1;
		this.option_2 = option_2;
		this.option_3 = option_3;
		this.option_4 = option_4;
		this.correct_option = correct_option;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion_name() {
		return question_name;
	}

	public void setQuestion_name(String question_name) {
		this.question_name = question_name;
	}

	public String getOption_1() {
		return option_1;
	}

	public void setOption_1(String option_1) {
		this.option_1 = option_1;
	}

	public String getOption_2() {
		return option_2;
	}

	public void setOption_2(String option_2) {
		this.option_2 = option_2;
	}

	public String getOption_3() {
		return option_3;
	}

	public void setOption_3(String option_3) {
		this.option_3 = option_3;
	}

	public String getOption_4() {
		return option_4;
	}

	public void setOption_4(String option_4) {
		this.option_4 = option_4;
	}

	public String getCorrect_option() {
		return correct_option;
	}

	public void setCorrect_option(String correct_option) {
		this.correct_option = correct_option;
	}

	@Override
	public String toString() {
		return "Questions [question_id=" + question_id + ", question_name=" + question_name + ", option_1=" + option_1
				+ ", option_2=" + option_2 + ", option_3=" + option_3 + ", option_4=" + option_4 + ", correct_option="
				+ correct_option + "]";
	}
	

}
