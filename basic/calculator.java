package com.basic;

public class calculator {
	int a= 32;
	int b= 23;
	
	public void sum () {
		int sum = a+b;
		System.out.println("Sum of two no:- "+sum);
	}
	public void sub() {
		int sub = a-b;
		System.out.println("Sub of two no:- "+sub);
	}
	public void mul () {
		int mul = a*b;
		System.out.println("Mul of two no:- "+mul);
	}
	public void div () {
		int div = a/b;
		System.out.println("div of two no:- "+div);
	}

	public static void main(String[] args) {
		calculator c=new calculator();
		c.sum();
		c.sub();
		c.mul();
		c.div();

	}

}
