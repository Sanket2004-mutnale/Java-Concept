package com.Loops;

public class for_loop_programs {
	

	public static void main(String[] args) {
 //  print 1 to 10		
		int n=2;
		for(int i=1;i<=10;i++){
			System.out.println(n+"*"+i+"="+(i*n));
		}
		
		System.out.println("**************************");
//addition of 1 to 10 		
		int sum =0;
		for(int a=1;a<=10;a++) {
		
			sum =sum+a;
		}
		System.out.println("Addition of  1to 10 natural number is: "+sum);
		System.out.println("**************************");
		System.out.println("reverse number");
		for(int b=10;b>=1;b--) {
			System.out.println(b);
		}
//odd even number 1 to 10		
		
		System.out.println("odd even number 1 to 10");
		
		for (int c=1;c<=10;c++) {
			if(c%2==0) {
				System.out.println(c+"= even number");
			}
			else {
				System.out.println(c+"= odd number");
			}
		}
	//break keyword	
		System.out.println("*************************************");
		System.out.println("break keyword");	
		for (int d=1;d<=10;d++) {
			if(d==4) {
				
				break;
				
				
			}
			System.out.println(d);
			
		}
//	continue keyword	
	System.out.println("continue keyword");	
		for (int e=1;e<=10;e++) {
			if(e==4) {
				continue;
			}
			System.out.println(e);
			
		}
		
		
	}

}
