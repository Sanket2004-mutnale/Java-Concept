package com.basic;

public class opertor {

	public static void main(String[] args) {
//		Arithmetic operator
		System.out.println("Arithmetic operator");
		int a =12;
		int b= 13;
		int c= 5;
//		Addition 
		
		System.out.println("a + b = " + (a + b));
	    System.out.println("a - b = " + (a - b));
	    System.out.println("a * b = " + (a * b));
	    System.out.println("a / b = " + (a / b));
	    System.out.println("a % b = " + (a % b));
	    
	    System.out.println("***********************************");
		
//	     Assignment Operator
	    System.out.println("Assignment Operator");
	    int f = 7;
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));
		
        System.out.println("***********************************");
        
//      Relational Operator
        System.out.println("  Relational Operator");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
        System.out.println("***********************************");
        
//		Bitwise Operators
        
        System.out.println("Bitwise Operators");
//         & (Bitwise AND) – returns bit-by-bit AND of input values.
//		   | (Bitwise OR) – returns bit-by-bit OR of input values.
//         ^ (Bitwise XOR) – returns bit-by-bit XOR of input values.
//         ~ (Bitwise Complement) – inverts all bits (one’s complement).
        
        int d = 0b1010;
        int e = 0b1100;
      
        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));
        System.out.println("***********************************");
        
        
// Logical operators
        System.out.println("Logical operators");
        boolean x = true;
        boolean y = false;
      
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
		
		
	}

}
