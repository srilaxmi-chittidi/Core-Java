package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObjectsStreamDemo {

	public static void main(String[] args) {
		
		List<Users> userList = Stream.of(
				new Users(1, "abc" ,Arrays.asList("abc@gmail.com","xyz@gmail.com")),
				new Users(2, "def" ,Arrays.asList("def@gmail.com","uvw@gmail.com")))
				.collect(Collectors.toList());
		
		// Map Demo - provides the list
		//Output : [abc, def]
		List<String> list = userList.stream().map(Users :: getName).sorted().collect(Collectors.toList());
		System.out.println(list);
		
		userList.stream().map(Users :: getId).sorted().forEach(System.out::println);
		
		//FlatMap Demo - Flattens the list and returns
		// instead of [[abc@gmail.com, def@gmail.com], [uvw@gmail.com, xyz@gmail.com]]
		//O/P : [abc@gmail.com, def@gmail.com, uvw@gmail.com, xyz@gmail.com]
		List<String> list2 = userList.stream().flatMap( u -> u.getEmail().stream()).sorted().collect(Collectors.toList());
		System.out.println(list2);
	}
}
