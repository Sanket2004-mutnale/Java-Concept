package com.patterns;

public class pyramid {

	public static void main(String[] args) {
		
		//important for interview
			int n=5;
			for(int row=1;row<=n;row++) {
				for(int col=n-1;col>=row;col--) {
					System.out.print(" ");
				}
				for(int j=1;j<=row;j++) {
					System.out.print("* ");
				}System.out.println();
			}
			System.out.println("----------------------------------------");
			
//			
	
			for(int row=1;row<=4;row++) {
				for(int col=4;col>=row;col--) {
					System.out.print(" ");
				}
				for(int j=1;j<=row;j++) {
					System.out.print("* ");
				}System.out.println();
			}
	
	
	
System.out.println("----------------------------------------");
			
//	print pyramid using if-else condition 		
	
			for(int row=1;row<=5;row++) {
				for(int col=5;col>=1;col--) {
					if(col>=row) {
						System.out.print(" ");
					}
					else {
						System.out.print("* ");
					}
					
				}System.out.println();
				
			}
			System.out.println("----------------------------------------");
			
//			print pyramid without using if-else condition 		
			int m=5;
			for(int row=1;row<=m;row++) {
				for(int col=m-1;col>=row;col--) {
					System.out.print(" ");
				}
				for(int j=1;j<=row;j++) {
					System.out.print("* ");
				}System.out.print("\n");
			}
			System.out.println("----------------------------------------");
			
	//		print row
			for(int row=1;row<=5;row++) {
				for(int col=5-1;col>=row;col--) {
					System.out.print(" ");
				}
				for(int j=1;j<=row;j++) {
					System.out.print(row+" ");
				}System.out.print("\n");
			}
			System.out.println("----------------------------------------");
			
			for(int row=1;row<=5;row++) {
				for(int col=5-1;col>=row;col--) {
					System.out.print(" ");
				}
				for(int j=1;j<=row;j++) {
					System.out.print(j+" ");
				}System.out.print("\n");
			}
			System.out.println("----------------------------------------");
			
		//palendrom	
			int p= 5;
			for(int row=1;row<=p;row++) {
				for(int col=1;col<=p-row;col++) {
					System.out.print(" ");
				}
				for(int j=row;j>=1;j--) {
					System.out.print(j);
				}
			
				for(int col=2;col<=row;col++) { 
					System.out.print(col);
					
				}
				System.out.print("\n");
			}
			System.out.println("----------------------------------------");
			
			for(int row=1;row<=p;row++) {
				for(int col=1;col<=p-row;col++) {
					System.out.print(" ");
				}
				for(int j=row;j>=1;j--) {
					System.out.print(j);
				}
				//col=1  fakt 1 chi line vadate
				for(int col=1;col<=row;col++) { 
					System.out.print(col);
					
				}
				System.out.print("\n");
			}
			System.out.println("----------------------------------------");
			
			for(int row=5;row>=p-row;row--) {
				for(int col=1;col<=p-row;col++) {
					System.out.print(" ");
				}
				for(int j=row;j<=1;j++) {
					System.out.print("");
				}
			
				for(int col=1;col<=row;col++) { 
					System.out.print( row+" " );
					
				}
				System.out.print("\n");
			}
			System.out.println("----------------------------------------");
	
	//pascal's triangle
			
			int t=5;
			for(int row=1;row<=t;row++) {
				int d=1;
				for(int col=t-1;col>=row;col--) {
					
					System.out.print(" ");
				}
				for(int j=1;j<=row;j++) {
					System.out.print(d+" ");
					d= d*(row-j)/j;              //d=d*(row-a)/(d+1)
				}System.out.println();
			}
		    

			System.out.println("----------------------------------------");	
			
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=5;col++) {
					if(col==3||row==3) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}System.out.println();
			}
			System.out.println("----------------------------------------");
			
			for(int row=0;row<5;row++) {
				for(int col=0;col<5;col++) {
					if(col==row||((row+col)==5-1)) {
						System.out.print(col);
					}
					else {
						System.out.print(" ");
					}
				}System.out.println();
			}
			System.out.println("----------------------------------------");
			
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=5;col++) {
					if(col==1||row==1||row==5||col==5) {
						System.out.print(col);
					}else {
						System.out.print(" ");
					}
				}System.out.println();
			}
			System.out.println("----------------------------------------");
			
			for(int row=0;row<5;row++) {
				for(int col=0;col<5;col++) {
					if(col==row||((row+col)==5-1)) {
						System.out.print((char)(col+65));
						
					}
					else {
						System.out.print(" ");
					}
				}System.out.println();
			}
			System.out.println("----------------------------------------");
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	}
	

}
