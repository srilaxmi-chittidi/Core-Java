package com.arrays.interviewQuestions;

import java.util.Arrays;

public class MaxEleInArray {

	public static void main(String[] args) {
		maxEleInArry8();
		maxEleInArry7();
	}
	public static void maxEleInArry8() {
		int[] arry = {2,5,1,6,9};
		int max = Arrays.stream(arry)
				.parallel()
				.max()
				.orElse(Integer.MIN_VALUE);
		System.out.println(max);
	}
	public static void maxEleInArry7() {
		int[] arry = {2,5,1,6,9};
		int max = arry[0];
		for(int i=1;i<arry.length ;i++) {
			max = (max < arry[i])? arry[i] : max;
		}
		System.out.println(max);
	}
}
