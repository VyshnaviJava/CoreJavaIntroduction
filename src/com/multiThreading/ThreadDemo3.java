package com.multiThreading;

class videoThread extends Thread{
	@Override
	public void run() {
		System.out.println("video started");
		System.out.println(Thread.currentThread());
		for(int i=0;i<=10;i++) {
			System.out.println("video thread");
		}
		System.out.println("video ended");
	}

}
class AudioThread extends Thread{
	@Override
	public void run() {
		System.out.println("audio started");
		System.out.println(Thread.currentThread());
		for(int i=0;i<=10;i++) {
			System.out.println("audio thread");
		}
		System.out.println("audio ended");
	}

}
class TimerThread extends Thread{
	@Override
	public void run() {
		System.out.println("Timer started");
		System.out.println(Thread.currentThread());
		for(int i=0;i<=10;i++) {
			System.out.println("Timer thread");
		}
		System.out.println("Timer ended");
	}

}

public class ThreadDemo3 {

	public static void main(String[] args) {
		System.out.println("main method stsrted");
		System.out.println(Thread.currentThread());
		videoThread v1= new videoThread();
		v1.start();
		AudioThread a1= new AudioThread();
		a1.start();
		TimerThread t1=new TimerThread();
		t1.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main");
		}
		System.out.println("main method ended");
	}
	}


