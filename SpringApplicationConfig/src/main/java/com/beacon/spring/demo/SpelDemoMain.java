package com.beacon.spring.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelDemoMain {

	public static void main(String[] args) {
		AbstractApplicationContext appContext = 
				new ClassPathXmlApplicationContext("spel.xml");
		
		SpelDemo spel = (SpelDemo) appContext.getBean("spel");
		
		System.out.println(spel);
		
		appContext.registerShutdownHook();
		appContext.close();
		

	}

}
