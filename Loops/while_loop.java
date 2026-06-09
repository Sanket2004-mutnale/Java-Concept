package com.Loops;

import java.util.Scanner;

public class while_loop {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int range = sc.nextInt();
  //print 1 to 10 number	
    	int a=0;
    	while(a<=range) {
    		System.out.println(a);
    		a++;
    	}
    	
 //Tables   	
    System.out.println("***************************");	
    System.out.println("table of "+range);
    	int b=1;
    	while(b<=10) {
    		System.out.println(range+"*"+b+"="+(range*b));
    		b++;
    	}
    	
    	
    	
	}	


}
