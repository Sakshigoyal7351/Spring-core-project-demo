package com.day1Ap8.autowire_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/day1Ap8/autowire_xml/config3.xml");
		Employee e = context.getBean("e1",Employee.class);
		System.out.println(e);
	
	}

}
