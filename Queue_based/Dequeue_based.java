package com.Queue_based;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue_based {
	public static void main(String[] args) {
		Deque<Integer>dd=new ArrayDeque<>();
		dd.add(12);
		dd.add(14);
		dd.add(13);
		dd.add(15);
		dd.add(17);
		dd.add(16);
		
		System.out.println("Deque:-"+dd);
		System.out.println("remove first:-"+dd.removeFirst());
		System.out.println("remove last:-"+dd.removeLast());
		System.out.println("remove:-"+dd.remove());
		System.out.println(dd);
		System.out.println(dd.peek());
		System.out.println(dd.poll());
		System.out.println(dd);
		System.out.println(dd.add(13));
		dd.addFirst(23);
		dd.addLast(45);
		System.out.println(dd);
	}
}
