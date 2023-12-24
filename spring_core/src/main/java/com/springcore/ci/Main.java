package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		A a=(A) context.getBean("aref");
		System.out.println("This is an example of Constructor Injection of Primitive,Collections and Object data types.");
		System.out.println(a);
		 
		addition ad=(addition) context.getBean("sumValue");
		ad.sum();
		
	}

}
