package com.Loops;

import java.util.Scanner;

public class switch_codition {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int marks= sc.nextInt();
		
		switch (marks) {
		case 1: System.out.println("projector is on");
		break;
		case 2:System.out.println("light is on");
		break;
		case 3: System.out.println("light is off");
		break;
		case 4:System.out.println("invalid option");
		break;
		}
		
		//Days
		
		int days =sc.nextInt();
		
		 
	        

	        // Switch statement with int data type
	        switch (days) {

	        // Case
	        case 1:
	         System.out.println("Monday");
	            break;

	        // Case
	        case 2:
	        	 System.out.println("tuesday");
		            break;


	            // Case
	        case 3:
	        	 System.out.println("wensaday");
		            break;


	            // Case
	        case 4:
	        	 System.out.println("Thursday");
		            break;


	        // Case
	        case 5:
	        	 System.out.println("friday");
		            break;

	            // Case
	        case 6:
	        	 System.out.println("Saturaday");
		            break;


	            // Case
	        case 7:
	        	 System.out.println("sunday");
		            break;

		}
	}
}
