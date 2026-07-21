package com.collections;
import java.util.Stack;

import java.util.List;

//stack :LIFO :Last in first out
//Queue: FIFO:first in first out

public class TestStackdemo1 {

	public static void main(String[] args) {
		
		Stack<String>  ll= new Stack<>();
		
		ll.push("jse");
		ll.push("j2ee");
		ll.push("my sql");
		ll.push("html");
		ll.push("javascript");
		ll.push("servlets");
		ll.push("spring");
		ll.push("boot");
		ll.push("jpa");
		
		System.out.println(ll.search("html"));
		
		//true if and only if this stack contains no items;false otherwise.
		System.out.println(ll.empty());
		//Looks at the object at the top of this stack without removing from stack
		System.out.println(ll.peek());
		
		//removes the object at the top of this stack and returns that object as the 
				//value of this function.
		System.out.println(ll.pop());
		
		System.out.println(ll);
		
	}

}
