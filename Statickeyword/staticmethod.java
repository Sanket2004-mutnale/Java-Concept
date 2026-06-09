package com.Statickeyword;

public class staticmethod {
	int a=10;
	static int b =20;
	
	public static void ww() {
		
	}
	static void a() {
		System.out.println("implement method");
		System.out.println(b);
	}
	public static void main(String[] args) {
		staticmethod d1 =new staticmethod();
		d1.ww();
		d1.a();
		System.out.println(staticmethod.b);
	}
}
