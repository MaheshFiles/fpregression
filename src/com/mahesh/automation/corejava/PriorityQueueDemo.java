package com.mahesh.automation.corejava;

import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
  //  Collection collection = new PriorityQueue();
	//	Queue queue = new PriorityQueue();
		PriorityQueue queue = new PriorityQueue();
		
		queue.add(456);
		queue.add(456);
		queue.add(56);
		queue.add(56);
		queue.add(456);
	//	queue.add("hello");    not allowing hetero geneous elements   clas  cast exception
	//	queue.add(null);     null point exception
		
		
		
		System.out.println(queue);
		
		
		
	}

}
