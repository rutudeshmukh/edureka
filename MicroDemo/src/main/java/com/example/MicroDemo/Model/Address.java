package com.example.MicroDemo.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Address")
public class Address {
	
	private String addressLine;
	private String city;
	private String state;
	private String zipCode;
	
	public Address() {
		super();
	}
	public Address(String addressLine, String city, String state, String zipCode) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
