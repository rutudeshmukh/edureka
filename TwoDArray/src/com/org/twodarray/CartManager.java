package com.org.twodarray;

public class CartManager {
	Cart cart;
	
	CartManager(int numberOfCustomers,int cartSize){
		cart= new Cart(numberOfCustomers,cartSize);
	}
	void addToCart(int customerId,Product product) {
		if(cart.cartSizes[customerId]<cart.carts[customerId].length) {
			cart.carts[customerId][cart.cartSizes[customerId]++]=product;
		}else {
			System.out.println("Cart is full");
		}
	}
	
	void displayCart(int customerId) {
		System.out.println("Cart for customer "+(customerId+1)+":");
		for(int i=0;i<cart.cartSizes[customerId];i++) {
			System.out.println((i+1)+"."+cart.carts[customerId][i].name+"-$"+cart.carts[customerId][i].price);
		}
	}
	double purchase(int customerId) {
		double total=0;
		for(int i=0;i<cart.cartSizes[customerId];i++) {
			total+=cart.carts[customerId][i].price;
		}
		cart.cartSizes[customerId]=0; //
		return total;
	}
}
