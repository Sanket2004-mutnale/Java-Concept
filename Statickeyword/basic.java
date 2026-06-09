package com.Statickeyword;

public class basic {

	void ab() {
		System.out.println("this is method");
	}
	static{
		System.out.println("this is static ");
	}
	basic(){
		System.out.println("this is constructor");
	}
	public static void main(String[] args) {
		basic b1= new basic();
		b1.ab();
	}
}

