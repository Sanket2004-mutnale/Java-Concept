package com.ExceptionHandling;

import java.rmi.UnexpectedException;

public class Multi_line_Exception {
	public static void main(String[] args) {
		try {
			System.out.println("Exception generate");
			
			try {
				int a=10/0;
			}
			catch(Exception e) {
				System.out.println("Arithmetic Exception");
				System.out.println(e.getMessage());
			}
		}
		catch(Exception w) {
			System.out.println(w.getMessage());
			
		}
	}

}
