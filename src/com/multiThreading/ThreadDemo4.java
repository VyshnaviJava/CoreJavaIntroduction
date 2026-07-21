package com.multiThreading;

public class ThreadDemo4 extends Thread {

    public static void main(String[] args) {

        System.out.println("main method started");
        System.out.println("Name " + Thread.currentThread().getName());

        ThreadDemo4 t = new ThreadDemo4();
        t.start();

        for (int i = 0; i <= 100; i++) {
            System.out.println("main");
        }

        System.out.println("main method ended");
    }

    @Override
    public void run() {

        System.out.println("run method started :");

        ThreadDemo4 t4 = new ThreadDemo4();
        t4.setName("Spring");

        Thread.currentThread().setName("Java");
        System.out.println("Name " + Thread.currentThread().getName());

        for (int i = 0; i <= 100; i++) {
            System.out.println("run");
        }
    }
}
