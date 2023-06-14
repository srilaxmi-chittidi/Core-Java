package com.basics.multithreading;

public class ThreadByImpl {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread2());
		t1.setName("First");
		t1.start();
		
		Thread t2 = new Thread(new MyThread2());
		t2.setName("Second");
		t2.start();
	}

}
class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}