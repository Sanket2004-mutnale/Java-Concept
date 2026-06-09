package com.Thread;

class basic implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child thread");
		}
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
			
		}
	}
	
public class ff{
		public static void main(String[] args) {
		Runnable bb=new basic();
		Thread t= new Thread(bb);
		t.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Main thread");
		}
		}
	}

}
