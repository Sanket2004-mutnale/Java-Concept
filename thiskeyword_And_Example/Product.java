package com.thiskeyword_And_Example;

public class Product {
	private String name ="banna";
	private int price=139;
	
	Product(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	public void show() {
		System.out.println("Product_Name:="+name+" "+"Prodcut_Price:="+price);
	}

	public static void main(String[] args) {
		Product p1 = new Product("Apple",200);
		p1.show();
	}

}
