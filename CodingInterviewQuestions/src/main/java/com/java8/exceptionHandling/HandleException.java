package com.java8.exceptionHandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HandleException {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("34","56");
		List<Integer> list1 = Arrays.asList(34,56);

		//list.forEach(handleGenericException(x->System.out.println(Integer.parseInt(x)),
		//		NumberFormatException.class));
		list1.forEach(handleGenericException(x->System.out.println(x/0),
				ArithmeticException.class));
		//list.stream().forEach(handleException(x->System.out.println(Integer.parseInt(x))));
		//list.stream().forEach(HandleException::printMe);
		//.map(Integer::parseInt).forEach(x->System.out.println(x));
		//collect(Collectors.toList());
		
	}
	
//	public static void printMe(String s) {
//		try {
//			Integer.parseInt(s);
//			System.out.println(s);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
	public static Consumer<String> handleException(Consumer<String> payload){
		return obj -> {
			try {
				payload.accept(obj);
			}catch(NumberFormatException ne) {
				ne.printStackTrace();
			}
		};
	}
	public static <Target,ExObj extends Exception> Consumer<Target> handleGenericException(Consumer<Target> targetConsumer,
															Class<ExObj> exObjClass){
		return obj -> {
			try {
				targetConsumer.accept(obj);
			}catch(NumberFormatException ne) {
				try {
				   ExObj exObj = exObjClass.cast(targetConsumer);
				   System.out.println(exObj.getMessage());
				}catch(ClassCastException e) {
				   e.printStackTrace();
				}
			}
		};
	}
}
