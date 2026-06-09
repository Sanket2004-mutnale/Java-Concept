package com.thiskeyword_And_Example;

public class withconstructor {
	
	withconstructor(){
		this(10);
		System.out.println("default constructor");
	}
	
	withconstructor(int a){
		System.out.println(a);
	}

	public static void main(String[] args) {
		withconstructor w1 =new withconstructor();
		
	}
}
