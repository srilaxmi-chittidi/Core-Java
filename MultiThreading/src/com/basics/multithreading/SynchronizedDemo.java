package com.basics.multithreading;

public class SynchronizedDemo {

	private int count = 0;
	public static void main(String[] args) {
		SynchronizedDemo sd = new SynchronizedDemo();
		sd.doWork();
		System.out.println(sd.count);
	}
	public synchronized int increment() {
		return count++;
	}
	public void doWork() {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					increment();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					increment();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t1.start(); t2.start();
	}
}
