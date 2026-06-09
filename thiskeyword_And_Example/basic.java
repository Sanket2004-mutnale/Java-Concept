package com.thiskeyword_And_Example;

public class basic {
	 int a=30;
	 
	basic(int a){
		System.out.println(a);
		System.out.println(this.a);
		
	}
	 
	void show () {
    	int a=20;
		System.out.println("local variable:-"+a);
		System.out.println("global variable:-"+this.a);
	
		
	}
	
	
	
	public static void main(String[] args) {
		basic b1 =new basic(40);
	    b1.show();	
	}

}

