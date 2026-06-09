package com.Abtractionbyinterface.vehical;

public class vehical implements twowheeler {

	@Override
	public void start() {
		System.out.println("Towwheeler is Start");
		
	}
	public void model() {
		System.out.println("BMW");
	}
	public static void main(String[] args) {
		vehical v1 = new vehical();
		v1.start();
		v1.price();
		v1.model();
	}
	

}
