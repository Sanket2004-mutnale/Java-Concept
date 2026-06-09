package com.Tests;

import java.util.Scanner;

public class TestString {
	public static void main(String[] args) {
		Scanner text =new Scanner(System.in);
      //Write a program to reverse a string without using built-in functions.
		
	 String name =text.nextLine();
	 String name2="";
	 for(int i= name.length()-1;i>=0;i--) {
		 name2=name2+name.charAt(i);
	 }
	 System.out.println(name2);
	 System.out.println("----------------------------------------");
	
	 //Count the number of vowels (a, e, i, o, u) in a given string. 
	 
	 
	
	
	
	}

}
           
  // Check if a given string is a palindrome (reads the same forward and backward).
  // Count the number of vowels (a, e, i, o, u) in a given string.                 
  // Find the longest word in a sentence.                                          
 //  Convert a string to title case (capitalize the first letter of each word).    