//write a program where an object of class order passes itself as a parameter to another class methods using this. 
package com.thiskeyword_And_Example;

public class order {
	String ordername;
	
	public order(String ordername) {
		this.ordername=ordername;
	}
	
	
	
	@Override
	public String toString() {
		return "order [ordername=" + ordername + "]";
	}



	public void show() {
		System.out.println(this);
	}
	
	
	public static void main(String[] args) {
		order o1 = new order("pizza");
		
		o1.show();
		
		
		
	}

}
