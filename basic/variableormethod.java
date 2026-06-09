package com.basic;

public class variableormethod {
  	int a= 12; //global variable
  	
  	public int meth1() {
  		System.out.println("integer method");
  		int c = 25; //local variable
  		System.out.println(c);
  		return 11;
  	}
  	
  	public String meth2() {
  		System.out.println("String method");
  		return "23";
  	}
  	
  	public float meth3() {
  		System.out.println("float method");
  		return 22f;
  	}
  	public long meth4() {
  		System.out.println("long method");
  		return 11111l;
  	}
  	public double meth5() {
  		System.out.println("double method");
  		return 11d;
  	}
  	public char meth6() {
  		System.out.println("char method");
  		return 'a';
  	}
  	public short meth7() {
  		System.out.println("integer method");
  		return 11233;
  	}
  	public byte meth8() {
  		System.out.println("byte method");
  		return 125;
  	}
  	public void sum(int d,int e ) {
  		
  		System.out.println(d+e);
  	}
  	
    public static void main(String[] args) {
    	variableormethod vm = new variableormethod();
    	vm.meth1();
    	vm.meth2();
    	vm.meth3();
    	vm.meth4();
    	vm.meth5();
    	vm.meth6();
    	vm.meth7();
    	vm.meth8();
    	vm.sum(12,12);
    	
	}
}
