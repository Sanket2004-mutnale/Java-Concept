package com.thiskeyword_And_Example;

public class bankaccount {
	private long acc_num;
	private int balance;
	
	bankaccount(int acc_num,int balance){
		this.acc_num=acc_num;
		this.balance=balance;
	}
	public void deposite(int amount) {
		
		balance = balance+amount;
		
	}
	public void withdraw(int amt) {
		balance =balance-amt;
		
	}
	public int getblance() {
		return balance;
	}
	public static void main(String[] args) {
		bankaccount SBI = new bankaccount(23424563,200);
		SBI.deposite(20);
		SBI.withdraw(20);
		SBI.deposite(10);
		System.out.println("Remaing balan:="+SBI.getblance());
	}
}
