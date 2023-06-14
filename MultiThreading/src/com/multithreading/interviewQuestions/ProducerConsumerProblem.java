package com.multithreading.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerProblem {
	
	private static final int LOWER_LIMIT = 0;
	private static final int UPPER_LIMIT = 5;
	private List<Integer> list = new ArrayList<>();
	private final Object lock = new Object();
	private int value =0;
	
	public void producer() throws InterruptedException{
		synchronized(lock) {
			while(true) {
				if(list.size() == UPPER_LIMIT) {
					System.out.println("Waiting for removing elements ..");
					lock.wait();
				}else {
					list.add(value);
					value++;
					System.out.println("Adding .."+value);
					lock.notify();
				}
			}
		}
	}
	public void consumer() throws InterruptedException{
		synchronized(lock) {
			while(true) {
				if(list.size() == LOWER_LIMIT) {
					System.out.println("Waiting for removing elem");
					lock.wait();
				}else {
					System.out.println("REmoving ele "+list.remove(list.size()-1));
					lock.notify();
				}
			}
		}
	}
	public static void main(String[] args) {
		
		ProducerConsumerProblem pc = new ProducerConsumerProblem();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.producer();
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.consumer();
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		
	}

}
