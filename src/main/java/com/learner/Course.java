package com.learner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bean2")
public class Course {

	@Value("1001")
	private int cid;
	@Value("java full stack")
	private String Cname;
	
	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		Cname = cname;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", Cname=" + Cname + "]";
	}
	
	
	
	
	
	
}
