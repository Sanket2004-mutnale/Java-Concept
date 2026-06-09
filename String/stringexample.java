package com.String;

public class stringexample {
	public static void main(String[] args) {
		String Str1 = "hello";
		String Str2 = "hello";
		
		if(Str1.equals(Str2)) {
			System.out.println("two string are equal.");
		}
		else {
			System.out.println("not equal.");
		}
	//Arrow function	
		System.out.println(Str1.equals(Str2) ? "equal" : "not equal");
		
	}

}
