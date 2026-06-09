package com.Access_modifier_inheritance;

class rect extends shape{
	public void perimeter() {
		area();
		System.out.println("cal peri");
	}
	
}

public class mains {
	public static void main(String[] args) {
		rect m1 = new rect();
		m1.perimeter();
	}

}
