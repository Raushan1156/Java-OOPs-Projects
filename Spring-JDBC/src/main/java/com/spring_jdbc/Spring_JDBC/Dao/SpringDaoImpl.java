package com.spring_jdbc.Spring_JDBC.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring_jdbc.Spring_JDBC.Entity.Student;

public class SpringDaoImpl implements SpringDao{

	private JdbcTemplate jdbcTemplate;
	
	
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query1="insert into Student(id,name,city) values(?,?,?)";
		int row=jdbcTemplate.update(query1,student.getId(),student.getName(),student.getCity());
		return row;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
