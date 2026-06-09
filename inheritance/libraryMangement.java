package com.inheritance;

class book{
		String Title;
		String Author;
		double Price;
		
		public book(String Title,String Author,double Price) {
			this.Title=Title;
			this.Author=Author;
			this.Price=Price;
		}
		void display() {
			System.out.println("Title:="+Title+" "+"Author:="+Author+" "+"Price:="+Price);
		}
	
}
class Ebook extends book{
	public int bookpages;
	Ebook(String Title,String Author,double Price,int bookpages){
		super(Title,Author,Price);
		this.bookpages=bookpages;
	}
	void show() {
		System.out.println("Title:="+Title+" "+"Author:="+Author+" "+"Price:="+Price+" "+"bookpages:="+bookpages);
		System.out.println("---------------------------------------------------------------");
	}
	
}
class Historical extends book{
	public int bookpages;
	Historical(String Title,String Author,double Price,int bookpages){
		super(Title,Author,Price);
		this.bookpages=bookpages;
	}
	void show() {
		System.out.println("Title:="+Title+" "+"Author:="+Author+" "+"Price:="+Price+" "+"bookpages:="+bookpages);
	}
}


public class libraryMangement {

	public static void main(String[] args) {
		Ebook e1=new Ebook("Historybook","ABCD",50000d,1000);
		e1.display();
        e1.show();
        Historical h1=new Historical("Sciencebook","XYZ",300d,200);
        h1.display();
        h1.show();
	}

}
