package com.Java8features;

public class TestJ8Demo6 {

	public static void main(String[] args) {
		System.out.println("main method ended");
		Runnable r=()->{
			for(int i=0;i<=10;i++) {
			System.out.println("run"+i);	
			}
		};
		Thread t= new Thread(r);
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main"+i);
		}
		
		

	}

}
