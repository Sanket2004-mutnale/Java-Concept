package com.Abtractionbyclass;

public class Car extends Vehical {

	Car(int a) {
		super(Vehical(a));
		
		
	}
	void display() {
		System.out.println(a);
	}
	@Override
	void start() {
		System.out.println("Car is start.");
		
	}
	@Override
	public void speed() {
		
		
	}
	public static void main(String[] args) {
		Car BMW =new Car();
		BMW.start();
		BMW.stop();
	}
	
		
}
