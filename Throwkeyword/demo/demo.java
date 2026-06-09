package com.Throwkeyword.demo;

public class demo {
	static int age =14;
	public static void main(String[] args) {
		try {
			if(age<18) {
				throw new SanketException ("Age is not valid");
			}
			else {
				System.out.println("age is valid");
			}
		}
		catch(SanketException s){
			System.out.println("age not fit");
		}
	}

}
