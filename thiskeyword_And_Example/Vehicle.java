package com.thiskeyword_And_Example;

public class Vehicle {
	private String Name;
	private int model;
	private int price;
	
	Vehicle(){
		this("sanket",2309);
		
		
	}
	
	Vehicle(String Name,int model){
		this.Name=Name;
		this.model=model;
		
		
	}
	
	Vehicle(int price){
		this.price=price;
	}
	void display() {
		System.out.println("Name:="+Name+" "+"Model:="+model+" "+"price:="+price);
	}
	public static void main(String[] args) {
		Vehicle v1=new Vehicle(34433);
		v1.display();
	}

}
