package com.basics.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
	
	public static void main(String args[]) throws InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++) {
			es.execute(new Processor(i));
		}
		es.shutdown();
		System.out.println("All tasks are submitted...");
		es.awaitTermination(1, TimeUnit.DAYS);
	}
}
class Processor implements Runnable{
	private int id;
	public Processor(int id) {
		this.id = id;
	}
	@Override
	public void run() {
		System.out.println("Starting : "+id);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completing : "+id);
	}
}