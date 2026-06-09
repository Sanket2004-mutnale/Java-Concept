package com.Polymorphism;

class payment {
	void pay() {
		System.out.println("payment processing......");
	}
}
class debitcard extends payment{
	void pay(){
		System.out.println("payment throgh the debitcard..!");
		}
}
class paytm extends payment{
	void pay () {
		System.out.println("payment throgh the paytm..!");
	}
}

public class overridding1 {
	public static void main(String[] args) {
		debitcard d1 =new debitcard();
		d1.pay();
		
		paytm p1 =new paytm();
		p1.pay();
	}
}
