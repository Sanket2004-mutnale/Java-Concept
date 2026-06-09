package com.patterns;

public class half_pyramid {
	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		for(int row=1;row<=5;row++) {
			for(int col=5;col>=row;col--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=row;col--) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------");
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=row;col--) {
				System.out.print((char)(row+64));
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		for(int row=0;row<5;row++) {
			for(int col=row;col>=0;col--) {
				System.out.print((char)(col+65));
			}
			System.out.println();
		}
		System.out.println("--------------------------");
	
	//0 1 right angled triangle	
		for(int row=0;row<5;row++) {
			for(int col=0;col<=row;col++) {
				System.out.print(((row+col)%2));
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		
		int first=0;
		int second =1;
		int result=0;
		
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				first =second;
				second = result;
				
				 System.out.print(result+" ");
				 result = first+second;
				 
			}
			
			System.out.println();
		}
		System.out.println("--------------------------");
	
		
		int firstnum=0;
		int secondnum =1;
		int resultnum=0;
		
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=row;col++) {
				firstnum =secondnum;
				secondnum = resultnum;
				
				 System.out.print(resultnum+" ");
				 resultnum = firstnum+secondnum;
				 
			}
			firstnum=0;
			secondnum=1;
			resultnum=0;
			System.out.println();
		}
		System.out.println("--------------------------");
		
	//Print AbC... 	
		char a = ((char)+65);
		for(int row=1;row<=5;row++ ) {
			for(int col =1; col<=5;col++) {
				System.out.print(" "+a+" ");
				a++;
				
			}System.out.println();
		}
		System.out.println("--------------------------");
		
//imp question	inverted half pryrimid	
		for(int row =1;row<=5;row++) {
			for(int col =1;col<=5-row;col++) {
				System.out.print(" ");
			}
			for(int j=1;j<=row;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		for(int row =5;row>=1;row--) {
			for(int col =1;col<=5-row;col++) {
				System.out.print(" ");
			}
			for(int j=1;j<=row;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
	
	
	
	}
	

}
