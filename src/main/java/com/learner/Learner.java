package com.learner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bean1")
public class Learner {

	@Value("101")
	private int id;
	@Value("Sakshi goyal")
	private String name;
	
	@Value("Delhi")
	private String city;
	@Value("77578986687")
	private String phno;
	
	@Autowired
	private Course course;

	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Learner(int id, String name, String city, String phno, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.phno = phno;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Learner [id=" + id + ", name=" + name + ", city=" + city + ", phno=" + phno + ", course=" + course
				+ "]";
	}
	
	
	
	
}
