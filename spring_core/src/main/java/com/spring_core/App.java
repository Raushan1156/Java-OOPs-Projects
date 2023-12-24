package com.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		student student1=(student) context.getBean("student_1");
		System.out.println(student1);
		
		student student2=(student) context.getBean("student_2");
		System.out.println(student2);
		
		student student3=(student) context.getBean("student_3");
		System.out.println(student3);
		
		student student4=(student) context.getBean("student_4");
		System.out.println(student4);
		
		student student5=(student) context.getBean("student5");
		System.out.println(student5);
    }
}
