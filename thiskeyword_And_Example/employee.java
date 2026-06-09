package com.thiskeyword_And_Example;

public class employee {
	private int id;
	private String name;
	private int salary;

	public employee(int id, String name, int salary) {
		this.id =id;
		this.name=name;
		this.salary=salary;
	}
		
	public void display() {
		System.out.println("id:"+id+" "+"name:"+name+" "+"salary:"+salary);
		
	}
		
	
	public static void main(String[] args) {
		employee e1 = new employee(12,"sanket",25000);
		e1.display();
	}

}
