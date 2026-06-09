package com.ExceptionHandling;

public class Array_Exception {
        public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	try {
	System.out.println(arr[6]);
	}
	catch(Exception e) {
		System.out.println("ArrayIndexOutOfBoundsException");
		System.out.println(e.getMessage());
	}
}
}
