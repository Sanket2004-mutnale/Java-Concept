package com.patterns;

public class square {
	public static void main(String[] args) {
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=4;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=4;col++) {
				if(row==1||col==1||row==4||col==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=4;col++) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
	    
		
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=4;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		
		for(int row=4;row>=1;row--) {
			for(int col=4;col>=1;col--) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		
		int a=1;
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				System.out.print(" "+a+" ");
				a++;
			
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------------------------------------------");
//odd number		
		int b=1;
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				System.out.print(" "+b+" ");
				b+=2;
			
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------------------------------------------");
//even		
		int c=2;
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				System.out.print(" "+c+" ");
				c+=2;
			
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------------------------------------------");
// 0 1 0 1 0
// 1 0 1 0 1
		
	
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				System.out.print(" "+((row+col)%2)+" ");
				
			
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------------------------------------------");
		

		for(int row=1;row<=5;row++) {
			for(int col=0;col<=4;col++) {
				System.out.print(" "+(row%2)+" ");
				
			
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------------------------------------------");
		
//0000
//1111
//0000
		for(int row=0;row<5;row++) {
			for(int col=1;col<=5;col++) {
				System.out.print(" "+(row%2)+" ");
				
			
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------------------------------------------");
		
		for(int row=0;row<5;row++) {
			for(int col=0;col<5;col++) {
				System.out.print(" "+(col%2)+" ");
				
			
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------------------------------------------");
		
		for(int row=0;row<5;row++) {
			for(int col=1;col<=5;col++) {
				System.out.print(" "+(col%2)+" ");
				
			
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------------------------------------------");
		
		for(char row='A';row<='E';row++) {
			for(char col='A';col<='E';col++) {
				System.out.print(" "+col+" ");   //row   col
				
			
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------------------------------------------");

	
	
	
	
	
	
	
	
	
	
	}
}
