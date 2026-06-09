package com.Abtractionbyinterface;

public class ABmain implements A,B {

	@Override
	public void bc() {
		System.out.println("method bc");
		
	}

	@Override
	public void bd() {
		System.out.println("method cb");
		
	}

	@Override
	public void ab() {
		System.out.println("method ab");
		
	}

	@Override
	public void ac() {
		System.out.println("method ac");
	}
	public static void main(String[] args) {
		ABmain a1= new ABmain();
		a1.ab();
		a1.ac();
		a1.bc();
		a1.ab();
		A.ad();
		a1.ae();
	}

}
