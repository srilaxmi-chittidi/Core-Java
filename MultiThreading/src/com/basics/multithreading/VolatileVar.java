package com.basics.multithreading;

public class VolatileVar {

	volatile int count =0;

	public static void main(String[] args) {
		VolatileVar v =new VolatileVar();
		v.doWork();
		System.out.println(v.count);
	}
	
	public void doWork() {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					//System.out.println(Thread.currentThread().getName()+" : "+count++);
					count++;
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					//System.out.println(Thread.currentThread().getName()+" : "+count++);
					count++;
				}
			}
		});
		t1.setName("No-One");t1.start();
		t2.setName("No-Two");t2.start();
		
		try {
			t1.join(); 
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
