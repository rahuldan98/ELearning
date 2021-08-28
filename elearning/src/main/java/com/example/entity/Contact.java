package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="contacttable")
public class Contact {
	@Column(name="contactid")
	int contactid;
	@Column(name="userid")
	int userid;
	@Column(name="name")
	String name;
	@Column(name="email")
	String email;
	@Column(name="feedback")
	String feedback;

	public Contact(int contactid, int userid, String name, String email, String feedback) {
		super();
		this.contactid = contactid;
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.feedback = feedback;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getContactid() {
		return contactid;
	}

	public void setContactid(int contactid) {
		this.contactid = contactid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

}
