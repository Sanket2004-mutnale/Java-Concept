package com.Access_Modifier_abstraction;

import com.Access_modifier_inheritance.shape;

class triangle extends shape{
	public void permi(){
		area();
		System.out.println("cal peri");
	}
}

public class adiition {
	public static void main(String[] args) {
		triangle t1 =new triangle();
		t1.permi();
	}
}
