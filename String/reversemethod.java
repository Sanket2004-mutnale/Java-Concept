package com.String;

import java.util.Scanner;

public class reversemethod {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String str= "Sanket";
		String str2 ="";
		
		
		for(int i=str.length()-1;i>=0;i--){
			
			str2=str2+str.charAt(i);
			
		}System.out.println(str2);
	
		
	String	Str3 =sc.nextLine();
	String Str4 ="";
	for(int i=Str3.length()-1;i>=0;i--) {
		Str4 =Str4+Str3.charAt(i);
		
	}
	System.out.println(Str4);
	
	
	
	
	
	}
}
