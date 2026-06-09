package com.ExceptionHandling;

public class Multiple_Catch {
	public static void main(String[] args) {
	try {
		 String Str =null;
		 System.out.println(Str.toLowerCase());
		 
		 System.out.println(4/0);
		 
		 int arr[]= {1,2,3};
		 
		 System.out.println(arr[5]);
	}
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}
	catch(ArithmeticException w) {
		System.out.println(w.getMessage());
	}
	catch(Exception x) {
		System.out.println(x.getMessage());
	}
	}
}
