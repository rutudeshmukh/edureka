package com.java;

public class Student {
	private String studentName;
	private int rollNo;
	private String studentId;
	String schoolName; //default member can not access outside the package but we can access private using getter and setter 
	
	Student(String studentName,int rollNo,String studentId){
		this.studentName=studentName;
		this.rollNo=rollNo;
		this.studentId=studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	
}
