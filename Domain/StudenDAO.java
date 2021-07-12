package com.example.studentmanagement.Domain;

import javax.persistence.Entity;
import javax.persistence.Table;


public class StudenDAO {
	private Long id;
	private String stname;

	private String coursename;

	public Long getId() {
	return id;
	}

	public void setId(Long id) {
	this.id = id;
	}

	public String getStname() {
	return stname;
	}

	public void setStname(String stname) {
	this.stname = stname;
	}

	public String getCoursename() {
	return coursename;
	}

	public void setCoursename(String coursename) {
	this.coursename = coursename;
	}
}
