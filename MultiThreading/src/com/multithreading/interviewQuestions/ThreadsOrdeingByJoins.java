package com.multithreading.interviewQuestions;

public class ThreadsOrdeingByJoins {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			System.out.println("Thread : "+Thread.currentThread().getName());
		});
		
		Thread t2 = new Thread(() -> {
			try {
				t1.join();
				System.out.println("Thread : "+Thread.currentThread().getName());
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		
		Thread t3 = new Thread(() -> {
			try {
				t2.join();
				System.out.println("Thread : "+Thread.currentThread().getName());
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");

		t1.start();
		t2.start();
		t3.start();
	}
	
}

class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread : "+Thread.currentThread().getName());
	}
	
}