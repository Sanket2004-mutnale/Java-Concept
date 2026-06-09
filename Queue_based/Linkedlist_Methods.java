package com.Queue_based;

import java.util.LinkedList;
import java.util.Queue;

public class Linkedlist_Methods {

	public static void main(String[] args) {
		Queue<Integer> q1=new LinkedList<>();
	    q1.add(12);
	    q1.add(13);
	    q1.add(14);
	    q1.add(15);
	    System.out.println("Queue:-"+q1);
	   //check head element 
	    System.out.println("Head element:-"+q1.peek());
	    System.out.println("REmove element from head:-"+q1.poll());
	    System.out.println(q1);
	    System.out.println(q1.offer(16));
	    System.out.println(q1);
	    System.out.println(q1.remove(14));
	    System.out.println(q1);
	    System.out.println(q1.removeAll(q1));
	    System.out.println(q1);


	}

}
