package com.java.multithreading;

public class LifecycleOfThread {

	public static void main(String[] args) {

		Thread m1 = new Thread(new MyThread());
		Thread m2 = new Thread(new MyThread());
		
		m1.start();
		m1.setName("Thread1");
		m2.start();
		m2.setName("Thread2");

		Thread.yield();
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
	}

}

class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Running currently "+Thread.currentThread().getName()+" "+Thread.currentThread().getState());
	}
	
}