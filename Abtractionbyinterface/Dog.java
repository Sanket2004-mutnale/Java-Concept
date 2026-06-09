package com.Abtractionbyinterface;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog can Eat");
		
	}

	@Override
	public void walk() {
		System.out.println("Dog walk on 4 legs");
		
	}

	@Override
	public void sound() {
		System.out.println("bho-bho");
		
	}
	public static void main(String[] args) {
		Dog d1 =new Dog();
		d1.eat();
		d1.sound();
		d1.walk();
	}

}
