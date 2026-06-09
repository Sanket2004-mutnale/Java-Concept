package com.String;


public class stringbuilder{

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Sanket");
		StringBuilder sc = new StringBuilder ("sunil");
		System.out.println(sb.capacity());

		System.out.println(sb.length());
		
		System.out.println(sb.indexOf("k"));
		
		System.out.println(sb.substring(4,5));
		
		System.out.println(sb.lastIndexOf("u"));
		
		System.out.println(sb.insert(0, "s"));
		
		System.out.println(sb.delete(6,12));
		 
		System.out.println(sb.capacity()); // capacity in bulit is 16
		
		System.out.println(sb.charAt(0));
		

	}

}

