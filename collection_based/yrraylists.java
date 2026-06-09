package com.collection_based;

import java.util.ArrayList;
import java.util.Collections;



public class yrraylists {

	public static void main(String[] args) {

		ArrayList<Integer> A1= new ArrayList<>(); 
	    A1.add(12);
	    A1.add(14);
	    A1.add(16);
	    A1.add(17);
	    A1.add(15);
	    A1.add(11);
	
	    
	    System.out.println("ArrayList elemnts:-"+A1);
	    A1.remove(3); //Remove element
	    System.out.println(A1);
	    A1.set(1, 13);
	    System.out.println(A1);
	    System.out.println(A1.size());
	   //A1.clear();
	  //  System.out.println("Clear elements:-"+A1);
	    
	   Collections.sort(A1);
	   System.out.println("Collection:"+A1);
	    
	  
	    
	   
	    //Generic method
	    ArrayList<String> a2=new ArrayList<>();
	    a2.add("sanket");
	    a2.add("Dhananjay");
	    a2.add("Prathamesh");
	    a2.add("Ajit");
	    a2.add("Vishu");
	    
	    System.out.println("ArrayList elemnts:-"+a2);
	    a2.remove(3); //Remove element
	    System.out.println(a2);
//	    System.out.println(a2.addAll(A1));
	    System.out.println(A1);
	    System.out.println(a2.size());
	  //  a2.clear();
	   // System.out.println("Clear elements:-"+a2);
	    System.out.println(a2.get(3));
	   
	   
	    
	    
	   
	}

}