package com.inheritance;


class product{
	public  String Product_Name;
	public double price;
	public String category;
	
	product( String Product_Name,double price,String category){
		this.Product_Name=Product_Name;
		this.price=price;
		this.category=category;
	}	
		void display() {
			System.out.println("Product_Name:="+Product_Name+" "+"price:="+price+" "+"category:="+category);
		}
	
}
class Grocery extends product{
	public int expiry;
	Grocery(String Product_Name,double price,String category,int expiry){
		super(Product_Name,price,category);
		this.expiry=expiry;
	}
	void display() {
		System.out.println("Product_Name:="+Product_Name+" "+"price:="+price+" "+"category:="+category+" "+"expiry:="+expiry+"hour");
	}
}
public class productsingle {

	public static void main(String[] args) {
		Grocery g1=new Grocery("Milk",33,"dairy_product",24);
		g1.display();
	}
}
