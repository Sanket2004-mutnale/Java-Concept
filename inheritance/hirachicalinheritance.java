package com.inheritance;

class employee{
	public String name;
	public int id;
	public double salary;
	
	employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
		
		}
	void show() {
		System.out.println("Name:-"+name+"id:="+id+"salary:="+salary);
	}
	
}
class Managers extends employee{
	public double bonus;
	public double totalsalary;
	public Managers(String name,int id,double salary,double bonus){
		super(name,id,salary);
		this.bonus=bonus;
		 totalsalary= bonus+salary;
	}
	
     
	
	 
	 void show1() {
		 System.out.println("Name:-"+name+" "+"id:="+id+" "+"salary:="+salary+" "+"bonus:="+bonus+" "+"totalsalry:="+totalsalary);
	 }
}
class devloper extends employee{
	public devloper(String name,int id,double salary,String skill){
		super(name,id,salary);
		this.skill=skill;
	}
	public String skill;
	void show2() {
		System.out.println("Name:-"+name+" "+"id:="+id+" "+"salary:="+salary+" "+"skill:="+skill);
		
	}
}


public class hirachicalinheritance {

	public static void main(String[] args) {
		devloper s1=new devloper("sanket",12,20000d,"intelligient");
		
		
		s1.show2();
		
		Managers d1=new Managers("dhannajay",13,30000d,2000d);
		
		
		d1.show1();
		
	}

}
