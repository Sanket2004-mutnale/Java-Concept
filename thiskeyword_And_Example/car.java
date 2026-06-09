package com.thiskeyword_And_Example;

public class car {
	private String brand;
	private int model;
	private int price;
	
	car( int model,String brand){
		this.brand=brand;
		this.model=model;
		System.out.println("brand:-"+brand);
		System.out.println("model:-"+model);
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

	public static void main(String[] args) {
	 car c1 =new car(2024,"BMW");
	 c1.setPrice(1000000);
	 System.out.println(c1.getPrice());

	}



	

}
