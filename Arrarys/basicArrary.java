package com.Arrarys;

import java.util.Arrays;
import java.util.Scanner;

public class basicArrary {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of array");
		int size=0;

		if(sc.hasNextInt()) {
			size =sc.nextInt();
		}
		int arr2[]=new int[size];
		System.out.println("enter the element");
		for(int i=0;i<=size;i++) {
			if(sc.hasNextInt()) {
				arr2[i]=sc.nextInt();
			}
		}
		System.out.println("display element:");
		for(int q=0;q<arr2.length;q++) {
			System.out.print(Arrays.toString(arr2));
		}
		sc.close();
	
	     
	      
	      
	}
}
