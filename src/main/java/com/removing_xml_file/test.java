package com.removing_xml_file;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = 
				new AnnotationConfigApplicationContext(config.class);
		
		Employee emp = context.getBean("emp",Employee.class);
		System.out.println(emp);
	}

}
