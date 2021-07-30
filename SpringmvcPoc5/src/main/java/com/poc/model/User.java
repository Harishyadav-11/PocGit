package com.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Userdetails")
@Component
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(name="fName")
	private String uFirstName;
	@Column(name="lName")
	private String uLastName;
	@Column(name="Email")
	private String uEmaiId;
	@Column(name="Password")
	private String uPassword;
	public User() {
		super();
	}
	public User(int userId, String uFirstName, String uLastName, String uEmaiId, String uPassword) {
		super();
		this.userId = userId;
		this.uFirstName = uFirstName;
		this.uLastName = uLastName;
		this.uEmaiId = uEmaiId;
		this.uPassword = uPassword;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getuFirstName() {
		return uFirstName;
	}
	public void setuFirstName(String uFirstName) {
		this.uFirstName = uFirstName;
	}
	public String getuLastName() {
		return uLastName;
	}
	public void setuLastName(String uLastName) {
		this.uLastName = uLastName;
	}
	public String getuEmaiId() {
		return uEmaiId;
	}
	public void setuEmaiId(String uEmaiId) {
		this.uEmaiId = uEmaiId;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", uFirstName=" + uFirstName + ", uLastName=" + uLastName + ", uEmaiId="
				+ uEmaiId + ", uPassword=" + uPassword + "]";
	}

}
