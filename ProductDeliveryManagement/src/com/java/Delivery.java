package com.java;

public class Delivery {
	Product product;
	Address address;
	
	public Delivery(Product product, Address address) {
		this.product = product;
		this.address = address; 
	}
	
	@Override
	public String toString() {
		return "Product:"+product.name+", Quantity:"+product.quantity+", Address:"+address.street+" ,"+address.city+", "+address.postalCode;
	}
	
}
