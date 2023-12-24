package com.spring_jdbc.Spring_JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring_jdbc.Spring_JDBC.Dao.SpringDao;
import com.spring_jdbc.Spring_JDBC.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring_jdbc/Spring_JDBC/SpringJDBC.xml");
        
        SpringDao dao= context.getBean("daoImpl",SpringDao.class);

        int result=dao.insert(new Student(5,"Nandan","Sitamarhi"));
        
        System.out.println("number of inserted row: "+result);
    }
}
