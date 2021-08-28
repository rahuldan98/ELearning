package com.example.entity;

import java.time.LocalDate;

public class User {
	int userid;
	String name;
	String password;
	String phnumber;
	String email;
	String address;
	LocalDate date;

	public User(int userid, String name, String password, String phnumber, String email, String address,
			LocalDate date) {
		super();
		this.userid = userid;
		this.name = name;
		this.password = password;
		this.phnumber = phnumber;
		this.email = email;
		this.address = address;
		this.date = date;
	}

	public User() {
		super();

	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhnumber() {
		return phnumber;
	}

	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
