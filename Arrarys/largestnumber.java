package com.Arrarys;

public class largestnumber {

	public static void main(String[] args) {
		int arr[]= {46,3,49,69,70,90,23,67,60};
		int max=arr[0];
		int min=arr[0];
		
		for(int largernum:arr) {
			if(largernum>max) {
				max=largernum;
			}
			
		}
		System.out.println("Largest no :-"+max);
		
		for(int samllnum:arr) {
			if(samllnum<min) {
				min=samllnum;
			}
			
		}
		System.out.println("smaller no :-"+min);

	}

}
