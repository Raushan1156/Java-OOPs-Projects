package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/employee.xml");
		employee emp1=(employee) context.getBean("employee1");
		
		System.out.println("employee object:"+emp1);
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhone());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourse());
		System.out.println(emp1.getAdd_prop());
	}

}
