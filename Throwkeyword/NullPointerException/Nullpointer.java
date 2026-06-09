package com.Throwkeyword.NullPointerException;

public class Nullpointer {
	
	public static void ch (String str)  {
		try {
			if (str==null) {
				throw new StringFull ("String cant be null");
			}
			else {
				System.out.println("String contain the word");
			}
		}
		catch(StringFull s) {
			System.out.println("Exception is occured");
		}
	}
	public static void main(String[] args) {
		ch(null);
		
	}

}
