package com.Examples;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		int first =0;
		int second =1;
		System.out.println(first);
		System.out.println(second);
		for(int i =2;i<=num;i++) {
			int result = first+second;
			System.out.println(result);
			first = second;
			second = result;
		}
		System.out.println();
		
	}

}
