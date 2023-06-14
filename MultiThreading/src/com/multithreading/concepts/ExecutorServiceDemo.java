package com.multithreading.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Runnable runnableTask = () -> {
			try {
				TimeUnit.MILLISECONDS.sleep(300);
				System.out.println("It is from Runnable");
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		};
		Callable<String> callableTask = () -> {
			TimeUnit.MILLISECONDS.sleep(300);
			return "Task's Execution s";
		};
		List<Callable<String>> callableTasks = new ArrayList<>();
		callableTasks.add(callableTask);
		callableTasks.add(callableTask);
		callableTasks.add(callableTask);
		
		//execute method
		executorService.execute(runnableTask);
		//submit method
		Future<String> task = executorService.submit(callableTask);
		System.out.println(task.get());
		//invokeAny() method
		String anyTask = executorService.invokeAny(callableTasks);
		System.out.println(anyTask);
		//invokeAll() method
		List<Future<String>> allTasks = executorService.invokeAll(callableTasks);
		System.out.println(allTasks.get(0).get());
	}
}
/* execute(), submit(), invokeAny() and invokeAll()*/
