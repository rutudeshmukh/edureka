package com.data.springEmpCrudDemo.model;

public class Emp {
	 int id;
	 String name;
	 int salary;
	 String skill;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, int salary, String skill) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.skill = skill;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", skill=" + skill + "]";
	}
	
	
	    
}
