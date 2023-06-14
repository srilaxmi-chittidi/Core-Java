package com.basics.multithreading;

public class ThreadByAnonymous {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(Thread.currentThread().getName()+" - "+i);
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(Thread.currentThread().getName()+" - "+i);
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.setName("One"); t1.start();
		t2.setName("Two"); t2.start();
	}
}
