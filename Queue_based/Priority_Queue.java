package com.Queue_based;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
	public static void main(String[] args) {
		Queue<Integer>pp=new PriorityQueue<>();
		pp.add(12);
		pp.add(34);
		pp.add(32);
		pp.add(54);
		pp.add(65);
		
		System.out.println(pp);
		
		while(!pp.isEmpty()) {
			System.out.println(pp.poll());
		}
		
		PriorityQueue<String>qq=new PriorityQueue<>();
		qq.add("A");
		qq.add("R");
		qq.add("F");
		qq.add("H");
		qq.add("N");
		
		System.out.println(qq);
		while(!qq.isEmpty()) {
			System.out.println(qq.poll());
		}
	}

}
