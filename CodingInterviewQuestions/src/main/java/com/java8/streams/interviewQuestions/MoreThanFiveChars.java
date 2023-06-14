package com.java8.streams.interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MoreThanFiveChars {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Afghanistan"); list.add("Albania"); list.add("Algeria"); 
		list.add("Andorra"); list.add("Angola"); list.add("Antigua and Barbuda ");
		list.add("Argentina"); list.add("Armenia"); list.add("Australia"); 
		list.add("Austria"); list.add("Azerbaijan");
		list.stream().filter(x->x.length()<5).forEach(System.out::println);
	}
	
	static Consumer<String> handleException(Predicate<String> payload){
		return obj -> {
			try{
				payload.test(obj);
			}catch(RuntimeException re) {
				throw new RuntimeException("This String has spaces : ");
			}
			
		};
	}
}
