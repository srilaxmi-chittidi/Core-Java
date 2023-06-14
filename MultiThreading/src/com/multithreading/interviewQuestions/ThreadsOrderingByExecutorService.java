package com.multithreading.interviewQuestions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadsOrderingByExecutorService {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		Future<?> t1Future = executorService.submit(() -> {
			System.out.println("t1Future");
		});
		
		Future<?> t2Future = executorService.submit(() -> {
			try {
				t1Future.get();
				System.out.println("t2Future");
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		});

		Future<?> t3Future = executorService.submit(() -> {
			try {
				t1Future.get();
				System.out.println("t3Future");
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		});
	}
}
