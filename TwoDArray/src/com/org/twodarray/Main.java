package com.org.twodarray;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ProductManager productManager = new ProductManager(5);
		CartManager cartManager = new CartManager(3,5); //3 customers, 5 products
		DeliveryManager deliveryManager = new DeliveryManager();
		
		//Adding products
		productManager.addProduct("laptop", 1000);
		productManager.addProduct("Phone",500);
		productManager.addProduct("Tablet", 300);
		
		boolean exit= false;
		while(!exit) {
			System.out.println("\n1. Display Products\n2. Add to Cart\n3.View Cart\n4. Purchase\n5. Deliver\n6. Exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					productManager.displayProducts();
					break;
				case 2:
					System.out.println("Enter customer Id(0-2): ");
					int customerId = sc.nextInt();
				    productManager.displayProducts();
				    System.out.println("Enter product number to add: ");
				    int productNumber = sc.nextInt();
				    Product product = productManager.getProduct(productNumber-1);
				    if(product!=null) {
				    	cartManager.addToCart(customerId, product);
				    }else {
				    	System.out.println("Invalid product number.");
				    }
				    break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				    
			}
					
		}
		
		
		

	}

}
