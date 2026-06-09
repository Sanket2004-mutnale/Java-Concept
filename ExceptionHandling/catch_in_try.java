package com.ExceptionHandling;

public class catch_in_try {
	public static void main(String[] args) {
		try {
			 String Str =null;
			 System.out.println(Str.toLowerCase());
			 
			 
			 
			 int arr[]= {1,2,3};
			 
			 System.out.println(arr[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			try {
				System.out.println(4/0);
			}
			catch(ArithmeticException w) {
				System.out.println(w.getMessage());
			}
		}
		
		catch(Exception x) {
			System.out.println(x.getMessage());
		}
	}

}
