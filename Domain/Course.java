package com.example.studentmanagement.Domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String coursename;
	private int duration;

	@OneToMany(fetch = FetchType.LAZY,
	cascade = CascadeType.ALL,mappedBy = "course")
	private List<Student> student;

	public Long getId() {
	return id;
	}

	public void setId(Long id) {
	this.id = id;
	}

	public String getCoursename() {
	return coursename;
	}

	public void setCoursename(String coursename) {
	this.coursename = coursename;
	}

	public int getDuration() {
	return duration;
	}

	public void setDuration(int duration) {
	this.duration = duration;
	}

	public List<Student> getStudent() {
	return student;
	}

	public void setStudent(List<Student> student) {
	this.student = student;
	}
  

}
