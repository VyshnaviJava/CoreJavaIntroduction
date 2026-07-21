package com.multiThreading;

public class ThreadDemo2 implements Runnable {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		ThreadDemo2 r= new ThreadDemo2();
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main:"+i);
		}
		System.out.println("Main method ended");
	}
		
	@Override
	public void run() {
		System.out.println("run method strated");
		for(int i=0;i<=10;i++) {
			System.out.println("run:"+i);
		}
		System.out.println("Run method ended");
		
		
	} 


	



	}


