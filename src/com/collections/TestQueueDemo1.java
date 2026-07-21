package com.collections;

import java.util.LinkedList;
import java.util.Queue;

//queue :FIFO : first in first out
public class TestQueueDemo1 {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(15);//IllegalstateException
		q.add(10);
		q.add(12);
		q.add(11);
		q.add(14);
		
		System.out.println(q.element());//NosuchElementexception
		System.out.println(q.remove());//NosuchElementexception
		System.out.println(q);
		
		System.out.println("************************");
		
		Queue<Integer> q1 = new LinkedList<>();
		q1.offer(18);
		q1.offer(16);
		q1.offer(19);
		q1.offer(20);
		q1.offer(17);
		
		System.out.println(q1.poll());
		System.out.println(q1.peek());
		System.out.println(q1);
		
	}

}
