package com.spring_core.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/lifecycle/config.xml");
		Smosa s1 = (Smosa) context.getBean("s1");

		System.out.println(s1);

		context.registerShutdownHook();
		
		Pepsi p1=(Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		Location loc=(Location) context.getBean("loc");
		System.out.println(loc);
	}

}
