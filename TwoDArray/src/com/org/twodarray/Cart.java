package com.org.twodarray;

public class Cart {
	Product[][] carts;
	int[] cartSizes;
	
	Cart(int numberOfCustomers,int cartSize){
		carts = new Product[numberOfCustomers][cartSize];
		cartSizes = new int[numberOfCustomers];
	}
}
