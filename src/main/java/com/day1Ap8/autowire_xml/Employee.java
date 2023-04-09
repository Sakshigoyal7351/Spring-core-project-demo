package com.day1Ap8.autowire_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	@Qualifier("address1")
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(Address address) {
		super();
		
		System.out.println("i am inside the constructor");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		System.out.println("inside setter ");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
	
}
