package com.basic;

public class hdfcbank {
	public static int  balance =1000;
	
	public void deposite(int amt) {
		balance = balance+amt;
		System.out.println("Remaining balancr: "+balance);
	}
	public void withdraw(int amt) {
		balance = balance-amt;
		System.out.println("Remaining balancr: "+balance);
	}

	public static void main(String[] args) {
		hdfcbank bank =new hdfcbank();
		bank.deposite(100);
		bank.withdraw(200);
      
		hdfcbank bank1 =new hdfcbank();
		bank1.deposite(300);
		bank1.withdraw(200);
		
		hdfcbank bank3 =new hdfcbank();
		bank3.deposite(400);
		bank3.withdraw(300);
	}

}
