package com.Abtractionbyclass;

abstract public class Vehical {
	public int a;
	public static int bw;
	
	Vehical(int a){
		this.a=a;
		
	}
	
    abstract void start();
	
	public void stop() {
		System.out.println("Vehical is Stop.");
	}
	abstract public void speed();

}
