package com.thiskeyword_And_Example;

public class Rectangle {
	int length;
	int breadth;
	Rectangle(){
		this.length=14;
		this.breadth=15;
		System.out.println("deafault constuctor");
		
	}
	
	Rectangle (int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	public void area() {
		System.out.println("area:-"+(length*breadth));
	}
	
	public void display() {
		System.out.println("length:"+length+" "+"breadth:"+breadth);
	}

	public static void main(String[] args) {
		Rectangle r2 =new Rectangle();
		r2.display();
		r2.area();
		Rectangle r1 = new Rectangle(12,13);
		r1.display();
		r1.area();
		
	
	}

}
