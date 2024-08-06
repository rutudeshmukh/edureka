package com.org.sim.data.model;

public class Dish {
	int dishId;
	String name;
	int price;
	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dish(int dishId, String name, int price) {
		super();
		this.dishId = dishId;
		this.name = name;
		this.price = price;
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", name=" + name + ", price=" + price + "]";
	}
	

}
