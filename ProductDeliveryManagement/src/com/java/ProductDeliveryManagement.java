package com.java;

public class ProductDeliveryManagement {

	public static void main(String[] args) {
		
			DeliveryManager manager = new DeliveryManager(5);
			
			//add deliveries 
			manager.addDelivery(new Product("Laptop",1),new Address("123 Main st","SpringField","123452"));
			manager.addDelivery(new Product("Mobile",2),new Address("456 Elm st","Ville","678904"));
			
			//displaying deliveries
			System.out.println("Deliveries:");
			manager.displayDeliveries();
			
			//updating a deliveries
			manager.updateDelivery(0, new Product("Tablet",1));
			manager.updateDelivery(1, new Address("789 Pls st","New York","456789"));
			
			//display deliveries
			System.out.println("Updated Deliveries:");
			manager.displayDeliveries();
			
			//removing a delivery
			manager.removeDelivery(0);
			
			//display deliveries after removing 
			System.out.println("Updated Deliveries after removal:");
			manager.displayDeliveries();
			
			
	        
	}

}
