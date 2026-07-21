package com.multiThreading;

public class TestThreadDemo1 extends Thread {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println(Thread.currentThread());
		TestThreadDemo1 t= new TestThreadDemo1();
		t.start();
		for(int i =0;i<=10;i++) {
			System.out.println("main:"+i);
		}
		System.out.println("Main method ended");

	}

	 public void run() {
		System.out.println("start method started");
		System.out.println(Thread.currentThread());
		for(int i =0;i<=10;i++) {
			System.out.println("start:"+i);
		}
		System.out.println("start method ended");
		
	}

}
