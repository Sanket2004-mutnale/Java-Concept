package com.TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		System.out.println("Enter the new element :-");
		int addelement=sc.nextInt();
		int newArray[]=new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			newArray[i]=arr[i];
		}
		newArray[newArray.length-1]=addelement;
		System.out.println("First Array:="+Arrays.toString(arr));
		System.out.println("New Array:="+Arrays.toString(newArray));
		
		

	}

}
