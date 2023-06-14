package com.java8.completableFuture;

public class EvenOrOddNumberWithoutjava8 implements Runnable{

	static int i =1;
	
	public static void main(String[] args) {

		
	}
	private Object object;
	
	public EvenOrOddNumberWithoutjava8(Object object) {
		this.object = object;
	}
	@Override
	public void run() {
		
		while(i<=10) {
			if(i%2 == 0 && Thread.currentThread().getName().equals("even")) {
				synchronized(object) {
					System.out.println(Thread.currentThread().getName()+" : "+i);
					i++;
					try {
						object.wait();
					}catch(InterruptedException i) {
						i.printStackTrace();
					}
				}
			}
			
			if(i%2 != 0 && Thread.currentThread().getName().equals("odd")) {
				synchronized(object) {
					System.out.println(Thread.currentThread().getName()+" : "+i);
					i++;
					object.notify();
				}
			}
		}
	}
}
