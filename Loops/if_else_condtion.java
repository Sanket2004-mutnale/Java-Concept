package com.Loops;

import java.util.Scanner;

public class if_else_condtion {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();
//positive or negative number		
		if (number>0) {
			System.out.println("The given number  "+number+" is positive number");
		}
		else {
			System.out.println("The given number  "+number+" is negative number");
		}
 // if else condition		
		int a= sc.nextInt();
		int b= sc.nextInt();
		if (a==b) {
			System.out.println("equal");
		}
		else {
			if(a<b) {
				System.out.println("a is greater then b");
			}
			else {
				System.out.println("a is not greater then b");
			}
		}
	}

}
