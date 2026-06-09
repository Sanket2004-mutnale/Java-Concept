package com.Examples;

import java.util.Scanner;

public class prime {
       public static void main(String[] args) {
		   Scanner sc = new Scanner (System.in);
		   int num =sc.nextInt();
		   
		   if (num <0) {
			   System.out.println("Enter the postive number");
		   }
		   else if(num==1) {
			   System.out.println("1 is composite number");
		   }
		   else if(num==2) {
			   System.out.println("even prime number");
		   }
		   else {
			   for (int i=2;i<num;i++) {
				   if(num%i==0) {
					   System.out.println("not prime");
					   break;
				   }
				   else {
					   System.out.println("prime");
				   }
			   }
		   }
		// print prime number	   
//		   if (num <0) {
//			   System.out.println("Enter the postive number");
//		   }
//		   else if(num==1) {
//			   System.out.println("1 is composite number");
//		   }
//		   else if(num==2) {
//			   System.out.println("even prime number");
//		   }
//		   else {
			  
		   //}
		   
		   for(int i=1;i<=10;i++) {
			   
		   }
		   for(int j=1;j<=10;j++) {
			   
		   }
	}
}

