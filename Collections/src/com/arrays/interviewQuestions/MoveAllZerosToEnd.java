package com.arrays.interviewQuestions;

import java.util.Arrays;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		int[] intArray = new int[] {9,0,3,2,0,7,0,1};
		int k =0;
		for(int n : intArray) {
			if(n>0) {
				intArray[k++] = n; 
			}
		}
		for(int i=k;i<intArray.length;i++) {
			intArray[i] = 0;
		}
		Arrays.stream(intArray).forEach(System.out::println);
	}
}
