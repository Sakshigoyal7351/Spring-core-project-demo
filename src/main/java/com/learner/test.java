package com.learner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/learner/config4.xml");
		Learner l = context.getBean("bean1", Learner.class);
		
		Course c = context.getBean("bean2",Course.class);
		System.out.println(l);
		System.out.println(c);
	}

}
