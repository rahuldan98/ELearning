package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admintable")

public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "adminid")
	int adminid;
	@Column(name = "email")
	String email;
	@Column(name = "password")
	String password;
	@Column(name = "name")
	String name;

	public Admin(int adminid, String email, String password, String name) {
		super();
		this.adminid = adminid;
		this.email = email;
		this.password = password;
		this.name = name;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
