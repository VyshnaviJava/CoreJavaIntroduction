package com.multiThreading;

public class ThreadDemo1 {

	public static void main(String[] args) {
		ThreadDemo1 t=new ThreadDemo1();
		t.show();
		
		for(int i =0;i<=10;i++) {
			System.out.println("main:"+i);
		}
		System.out.println("main method ended");

	}

	 void show() {
		 System.out.println("show method strated");
		 for(int i=0;i<=10;i++) {
			 System.out.println("show:"+i);
		 }
		 System.out.println("show method ended");
		
	}

}
