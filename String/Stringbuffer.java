package com.String;

public class Stringbuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Sanket");
		StringBuffer sc = new StringBuffer("sunil");
		System.out.println(sb.append("Mutnale"));
		
		System.out.println(sb.length());
		
		System.out.println(sb.indexOf("k"));
		
		System.out.println(sb.substring(4,9));
		
		System.out.println(sb.lastIndexOf("u"));
		
		System.out.println(sb.insert(0, "s"));
		
		System.out.println(sb.delete(6,12));
		 
		System.out.println(sb.capacity()); // capacity in bulit is 16
		
		System.out.println(sb.charAt(0));
		
		
		
	}

}
