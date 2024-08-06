package com.aggre;

public class Employee {
	private String name;
	private int id;
	private Department department;
	
	
	public Employee(String name,int id, Department department) {
		this.name = name;
		this.id=id;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
