package com.example.MicroDemo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="User")
public class User {

	@Id
	private int userId;
	private String name;
	private String phoneNo;
	private String email;
	private Address address;
	
	public User(int userId, String name, String phoneNo, String email, Address address) {
		super();
		this.userId = userId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
	}
	public User() {
		super();
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
