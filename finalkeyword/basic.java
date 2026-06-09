package com.finalkeyword;

public final class basic {
	final int a =10;
	int b= a+12;
	final void add() {
		//a=a+10;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		basic b1 =new basic();
		b1.add();
	}
	
	

}
