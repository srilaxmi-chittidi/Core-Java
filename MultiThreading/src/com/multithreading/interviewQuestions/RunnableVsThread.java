package com.multithreading.interviewQuestions;

public class RunnableVsThread {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.setName("T1");
		t1.start();
		MyThread1 t2 = new MyThread1();
		t2.setName("T2");
		t2.start();
		MyThread1 t3 = new MyThread1();
		t3.setName("T3");
		t3.start();
		MyThread1 t4 = new MyThread1();
		t4.setName("T4");
		t4.start();
		
		Thread t5 = new Thread(new MyRunnable());
		t5.setName("T5");
		t5.start();
		Thread t6 = new Thread(new MyRunnable());
		t6.setName("T6");
		t6.start();
		Thread t7 = new Thread(new MyRunnable());
		t7.setName("T7");
		t7.start();
		Thread t8 = new Thread(new MyRunnable());
		t8.setName("T8");
		t8.start();

		
		
	}
}
class MyRunnable implements Runnable{
	private int count = 1;
	@Override
	public void run() {
		System.out.println("From MyRunnable : "+Thread.currentThread().getName()+" "+count++);
	}
}
class MyThread1 extends Thread{
	private int count = 1;
	@Override
	public void run() {
		System.out.println("From MyThread : "+Thread.currentThread().getName()+" "+count++);
	}
}