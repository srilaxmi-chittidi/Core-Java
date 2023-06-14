package com.multithreading.interviewQuestions;

import java.util.concurrent.CountDownLatch;

public class ThreadsOrderingByCountdownLatch {

	public static void main(String[] args) {
		CountDownLatch l1 = new CountDownLatch(1);
		CountDownLatch l2 = new CountDownLatch(1);
		
		Thread t1 = new Thread(() -> {
			System.out.println("Thread : "+Thread.currentThread().getName());
			l1.countDown();  // Signal T2 to proceed
		});
		
		Thread t2 = new Thread(() ->{
			try {
				l1.await();  // Wait for T1 to complete
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread : "+Thread.currentThread().getName());
			l2.countDown();  // Signal T3 to proceed
		});
		
		Thread t3 = new Thread(() ->{
			try {
				l2.await();  // Wait for T2 to complete
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread : "+Thread.currentThread().getName());
		});
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");

		t1.start();
		t2.start();
		t3.start();
	}
}
