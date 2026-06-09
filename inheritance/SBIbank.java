package com.inheritance;

class bank{
	public int Acccount_no;
	public double balance;
	public double Amount;
	bank(int Acccount_no,double balance,double Amount){
		this.Acccount_no=Acccount_no;
		this.balance=balance;
		this.Amount=Amount;
	}
	
	void withdraw() {
		System.out.println(" balance:="+balance);
		balance=balance-Amount;
		System.out.println("current balance:= "+balance);
	}
	void deposite() {
		System.out.println(" balance:="+balance);
		balance=balance+Amount;
		System.out.println("current balance:= "+balance);
	}
}
class saving extends bank{
	public int interestrate;
	public double rate;
	 public saving(int Acccount_no,double balance,double Amount,int interestrate){
		  super(Acccount_no,balance,Amount);
		  this.interestrate=interestrate;
		 
	  }
	 void calculate() {
		 rate = balance*(interestrate/100);
		 System.out.println(rate);
	 }
}
class current extends bank{
	public current(int Acccount_no,double balance,double Amount){
		super(Acccount_no,balance,Amount);
		
		
	}
	void display() {
		if (balance>5000) {
			System.out.println("current balance"+balance);
		}
		else {
			System.out.println("deposite the amoonunt");
		}
	}
}

public class SBIbank {
	public static void main(String[] args) {
		saving s1=new saving(123456789,3000,100,100);
		s1.withdraw();
		s1.deposite();
		s1.calculate();
		
		current c1=new current(123456789,3000,100);
		c1.display();
		
	}
	
}
