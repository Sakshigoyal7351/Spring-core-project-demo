package com.removing_xml_file;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.removing_xml_file")
public class config {

	@Bean
	public Salary s1()
	{
		Salary s= new Salary(200000,50000);
		return s;
	}
	
	@Bean
	public Employee emp()
	{
		Employee e1= new Employee(101, "sakshi", "delhi", s1());
		return e1;
	}
}
