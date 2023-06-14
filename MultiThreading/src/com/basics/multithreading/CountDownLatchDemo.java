package com.basics.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i=0;i<3;i++) {
			executor.submit(new Worker(latch));
		}
		try {
			latch.await();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Completed.");
	}
	
}
class Worker implements Runnable{
	private CountDownLatch latch;
	
	public Worker(CountDownLatch latch) {
		this.latch = latch;
	}
	@Override
	public void run() {
		System.out.println("Started.");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown();
		System.out.println("Completed.");
	}
}