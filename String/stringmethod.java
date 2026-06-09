package com.String;

public class stringmethod {
	public static void main(String[] args) {
		String a= "Sanket";
		String b ="Mutnale";
		 
		String Str = new String("   hello");
		String Str1 = new String("hello world");
		
		System.out.println(a.concat(b));
		System.out.println(Str);
		//
		System.out.println(Str.length());// to used find the length of string
		
		System.out.println(Str.charAt(2));//used for getting value at a part index 
		//indexof
		System.out.println(Str.indexOf(2));
		
		System.out.println(Str.toUpperCase());// convert the uppercase
		
		System.out.println(Str.toLowerCase());// convert the lowercase
		
		System.out.println(Str.trim());  //remove the space
		
		System.out.println(Str1.substring(2,7));  //Give index number then it print words betwwen this index number
		
		System.out.println(Str.equals(Str1)); //checks the equal or not
		
		System.out.println(Str1.endsWith("ld"));  // check the starting char
		
		System.out.println(Str1.startsWith("hel"));//check the ending char
		
		String str2 = "   san  ket ";
		String trim = (str2.trim());
		System.out.println(trim.substring(0,3)+trim.substring(5));
		
		String str4= "Qweez";
		String str5= "qweez";
		System.out.println(str4.equalsIgnoreCase(str5)); //compares two strings, ignoring lower case and upper case differences.
		
		System.out.println("hellow\n welcome to \t our session \'thankyou\\"); //\n :- next line , \t:-space , \:-as it is write
		
		System.out.println(str4.isEmpty());
	}

}
