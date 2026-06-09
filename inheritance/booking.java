package com.inheritance;

class ticketbooking{
	int distance;
	int time;
	int price;
	ticketbooking(int distance,int time,int price){
		this.distance=distance;
		this.time=time;
		this.price=price;
	}
	
}
class train extends ticketbooking{
	train(int distance,int time,int price){
		super(distance,time,price);
	}
	void show() {
		System.out.println("distance:="+distance+"Km"+" "+"time:="+time+"hour"+" "+"price:="+price);
		System.out.println("Train journy is safe and enjoyable...!");
		System.out.println("---------------------------------------------------");
	}
}
class car extends ticketbooking{
	car(int distance,int time,int price){
		super(distance,time,price);
		
	}
	void show1() {
		System.out.println("distance:="+distance+"Km"+" "+"time:="+time+"hour"+" "+"price:="+price);	
		System.out.println("Car journy is Unsafe and enjoyable...!");
		System.out.println("---------------------------------------------------");
	}
	
}
class aeroplane extends ticketbooking{
	aeroplane(int distance,int time,int price){
		super(distance,time,price);
	}
	void show2() {
		System.out.println("distance:="+distance+"Km"+" "+"time:="+time+"hour"+" "+"price:="+price);
		System.out.println("Aeroplane journy is safe and enjoyable...!");
		System.out.println("---------------------------------------------------");
	}
}

public class booking {

	public static void main(String[] args) {
		train t1=new train(200,6,800);
		t1.show();
		car c1 =new car(150,5,500);
		c1.show1();
		aeroplane a1=new aeroplane(300,2,4000);
		a1.show2();

	}

}
