package com.beacon.spring.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext appContext = 
				new ClassPathXmlApplicationContext("Student.xml");
		
		Student student = (Student) appContext.getBean("student");
		
		System.out.println(student);
		
		appContext.registerShutdownHook();
		appContext.close();
		
		
	}

}
