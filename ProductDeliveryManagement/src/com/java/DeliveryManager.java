package com.java;

public class DeliveryManager {
	Delivery[] deliveries;
	int count;
	
	DeliveryManager(int size) {
		this.deliveries = new Delivery[size];
		this.count = 0;
	}
	//add delivery
	void addDelivery(Product product,Address address) {
		if(count<deliveries.length) {
			deliveries[count++]= new Delivery(product,address);
		}else {
			System.out.println("Delivery list is full."); 
		}
	}
	//remove delivery
	void removeDelivery(int index) {
		if(index>=0 && index<count) {
			for(int i=index;i<count-1;i++) {
				deliveries[i]=deliveries[i+1];
			}
			deliveries[--count]=null;
		}else {
			System.out.println("Invalid index.");
		}
	}
	//update delivery product
	void updateDelivery(int index,Product newProduct) {
		if(index>=0 && index<count) {
			deliveries[index].product = newProduct;
		}else {
			System.out.println("Invalid index");
		}
		
	}
	//update delivery address
	void updateDelivery(int index,Address newAddress) {
		if(index>=0 && index<count) {
			deliveries[index].address = newAddress;
		}else {
			System.out.println("Invalid index");
		}
	}
	void updateDelivery(int index,Product newProduct,Address newAddress) {
		if(index>=0 && index<count) {
			deliveries[index].address = newAddress;
			deliveries[index].product = newProduct;
		}else {
			System.out.println("Invalid index");
		}
	}
	public void displayDeliveries() {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++) {
		System.out.println(deliveries[i]);
		}
	}
}
