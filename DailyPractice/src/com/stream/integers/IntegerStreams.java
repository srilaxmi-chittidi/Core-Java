package com.stream.integers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerStreams {

	public static void main(String args[]) {
		//reverseNum();
		//missingNum();
		largestNSmallest();
	}
	public static void reverseNum() {
		int i =143;
		int r=0, num =0;
		while(i !=0 ) {
			r = i%10;
			num = num*10 + r;
			i = i/10;
		}
		System.out.println(num);
	}
	
	public static void missingNum() {
		int[] numbers = new int[] {1,2,3,5,6,7,8};
		int maxVal = Arrays.stream(numbers).max().getAsInt();
		
		int expectedSum = maxVal*(maxVal+1)/2; //32
		int actualSum = Arrays.stream(numbers).sum();
		int missingVal = expectedSum-actualSum;
		System.out.println(actualSum+" "+expectedSum);
		System.out.println(missingVal);
	}
	public static void largestNSmallest() {
		int[] numbers = new int[] {5,3,2,4,9,7,6};
		List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
		int largest2 = Arrays.stream(numbers)
				.max()
				.getAsInt();
		
		int largest1 = list.stream()
			.max(Comparator.comparing(Integer::valueOf))
			.get();
		System.out.println(largest2+" "+largest1);
		System.out.println("-----------------------");
		int smallest2 = Arrays.stream(numbers)
					.min()
					.getAsInt();
		int smallest1 = Arrays.stream(numbers).boxed().collect(Collectors.toList())
					.stream()
					.min(Comparator.comparing(Integer::valueOf))
					.get();
		System.out.println(smallest2+" "+smallest1);
	}
}
