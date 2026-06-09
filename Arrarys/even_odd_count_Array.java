package com.Arrarys;

public class even_odd_count_Array {
	public static void main(String[] args) {
		int arr[]= {1,2,3,35,5,6,7,8,9,10};
		int evencount=0;
		int oddcount=0;
		
		for(int count:arr) {
			if(count%2==0) {
				 evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("even no:="+evencount);
		System.out.println("odd no:="+oddcount);
	}

}
