//implement a methods in a class chainmethod that return the current object using this and allows methods chaining.
package com.thiskeyword_And_Example;

public class chainmethod {
	
	int value;
	
	public chainmethod setA(int value) {
		this.value=value;
		return this;
	}
	void show() {
		System.out.println("Current value:="+value);
	}
	public static void main(String[] args) {
		chainmethod c1=new chainmethod();
		c1.setA(12);
		c1.show();
	}

}
