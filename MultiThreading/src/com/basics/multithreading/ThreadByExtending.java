package com.basics.multithreading;

public class ThreadByExtending {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.setName("First");
		t1.start();
		
		MyThread1 t2 = new MyThread1();
		t2.setName("Second");
		t2.start();
		
	}
}
class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" Say Hello "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
