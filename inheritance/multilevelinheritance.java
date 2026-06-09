package com.inheritance;


class shapes{
	public void show() {
		System.out.println("you are in show method");
	}
}
class rect extends shapes{
	public void display() {
		System.out.println("you are in display method");
	}
}
class triangle extends rect{
	public void print() {
		System.out.println("you are in print method.");
	}
}

public class multilevelinheritance {
	public static void main(String[] args) {
		triangle t1 = new triangle();
		t1.show();
		t1.display();
		t1.print();
	}
}
