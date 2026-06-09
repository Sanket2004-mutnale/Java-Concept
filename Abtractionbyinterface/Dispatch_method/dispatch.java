package com.Abtractionbyinterface.Dispatch_method;

public class dispatch {
	public static void main(String[] args) {
		vehicle vv;
		vv=new car();
		vv.start();
		
		vv=new Bike();
		vv.start();
	}

}
