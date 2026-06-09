package com.Polymorphism;

class addition{
	void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	int add() {
		System.out.println("Sanket");
		return 0;
	}
	
	double add(String name) {
		System.out.println("name:="+name); 
		return 0d;
	}
}

public class overloading {

	public static void main(String[] args) {
		addition a1 =new addition();
		a1.add();
		a1.add("mutbale");
		a1.add(12, 13);

	}

}
