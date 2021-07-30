package com.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_details")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int admin_id;

	@Column(name="first_name")
	private String admin_first_name;
	
	@Column(name="last_name")
	private String admin_last_name;
	
	@Column(name="email")
	private String admin_email;
	
	@Column(name="Password")
	private String admin_password;

	public Admin() {
		super();
	}

	public Admin(int admin_id, String admin_first_name, String admin_last_name, String admin_email,
			String admin_password) {
		super();
		this.admin_id = admin_id;
		this.admin_first_name = admin_first_name;
		this.admin_last_name = admin_last_name;
		this.admin_email = admin_email;
		this.admin_password = admin_password;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_first_name() {
		return admin_first_name;
	}

	public void setAdmin_first_name(String admin_first_name) {
		this.admin_first_name = admin_first_name;
	}

	public String getAdmin_last_name() {
		return admin_last_name;
	}

	public void setAdmin_last_name(String admin_last_name) {
		this.admin_last_name = admin_last_name;
	}

	public String getAdmin_email() {
		return admin_email;
	}

	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_first_name=" + admin_first_name + ", admin_last_name="
				+ admin_last_name + ", admin_email=" + admin_email + ", admin_password=" + admin_password + "]";
	}
	
}
