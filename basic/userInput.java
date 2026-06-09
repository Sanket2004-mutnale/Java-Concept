package com.basic;
import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		
		Scanner Sub =new Scanner(System.in);
		int sub1 =Sub.nextInt();
		System.out.println("maths mark:"+sub1);
		int sub2=Sub.nextInt();
		System.out.println("science mark:"+sub2);
		int sub3 =Sub.nextInt();
		System.out.println("Marathi mark:"+sub3);
		int sub4 =Sub.nextInt();
		System.out.println("history mark:"+sub4);
		int sub5 =Sub.nextInt();
		System.out.println("java mark:"+sub5);
		
		float result = ((sub1+sub2+sub3+sub4+sub5)/5f);
	    System.out.println("total Avg:="+result);
	    
	    float total = sub1+sub2+sub3+sub4+sub5;
	    float percentage = ((total/500)*100f);
	    System.out.println("Total percentage:"+percentage);

	}

}
