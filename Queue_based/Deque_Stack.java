package com.Queue_based;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Stack {

	public static void main(String[] args) {
		Deque <String>Stack=new ArrayDeque();
		Stack.push("Sanket");
		Stack.push("Ram");
		Stack.push("Sham");
		Stack.push("Rohan");
		
		System.out.println(Stack);
		Stack.peek();
		System.out.println(Stack);
		Stack.poll();
		System.out.println(Stack);
		Stack.remove();
		System.out.println(Stack);
		Stack.add("rohan");
		System.out.println(Stack);
		Stack.pop();
		System.out.println(Stack);
	}

}
