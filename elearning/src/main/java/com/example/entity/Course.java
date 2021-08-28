package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="coursetable")
public class Course {
	@Column(name="courseid")
	int courseid;
	@Column(name="coursename")
	String coursename;
	@Column(name="coursedescription")
	String coursedescription;
	@Column(name="fees")
	double fees;

	public Course(int courseid, String coursename, String coursedescription, double fees) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.coursedescription = coursedescription;
		this.fees = fees;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getCoursedescription() {
		return coursedescription;
	}

	public void setCoursedescription(String coursedescription) {
		this.coursedescription = coursedescription;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

}
