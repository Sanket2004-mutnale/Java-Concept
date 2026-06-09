package com.inheritance;

import java.util.Scanner;

class shape{
	Scanner sc =new Scanner(System.in);
	int length=sc.nextInt();
	int breadth=sc.nextInt();
}
class rectangle extends shape{
	void area() {
		int area = length*breadth;
		System.out.println("Area of rectangle:="+area);
	}
}

public class singleinheritance {

	public static void main(String[] args) {
		rectangle r1 =new rectangle();
		r1.area();

	}

}
