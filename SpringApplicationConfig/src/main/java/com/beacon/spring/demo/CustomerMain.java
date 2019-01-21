package com.beacon.spring.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {
		AbstractApplicationContext appContext = 
				new ClassPathXmlApplicationContext("spel.xml");
		
		Customer customer = (Customer) appContext.getBean("customerBean");
		
		System.out.println(customer);
		
		appContext.registerShutdownHook();
		appContext.close();

	}

}
