package com.spring_core;

public class student {
	private int studentId;
	private String studentName;
	private String studentAdress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("setter method setting studentId.");
		this.studentId = studentId;
	}
	public String getStudentName() {
		
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("setter method setting studentName.");
		this.studentName = studentName;
	}
	public String getStudentAdress() {
		return studentAdress;
	}
	public void setStudentAdress(String studentAdress) {
		System.out.println("setter method setting studentAdress.");
		this.studentAdress = studentAdress;
	}
	public student(int studentId, String studentName, String studentAdress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAdress = studentAdress;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", studentName=" + studentName + ", studentAdress=" + studentAdress
				+ "]";
	}
	

}
