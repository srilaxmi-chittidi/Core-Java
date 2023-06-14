package com.basics.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ThirdElementInArray {

	public static void main(String[] args) {
		int g[]={5,3,8,9,2,7};
		int third = Arrays.stream(g).sorted().skip(2).findFirst().getAsInt();
		//System.out.println(third);
		
		/*List<Integer> list = Stream.of(1,2,3,4,5).toList();/*new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);*/
		
		Stream.of(1,2,3,4,5).toList().stream().filter(e->e%2==0).forEach(System.out::println);
		
		
	}

}
