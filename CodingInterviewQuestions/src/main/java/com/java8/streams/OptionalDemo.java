package com.java8.streams;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Optional<String> intVal = Optional.empty();
		if(intVal.isPresent())
			System.out.println(intVal.get());
		else
			System.out.println("Value is not present");
	}

}
