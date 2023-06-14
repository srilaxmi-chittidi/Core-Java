package com.arrays.interviewQuestions;

public class LargestSumOfSubArray {

	public static void main(String[] args) {
		int[] intArr = new int[] {8,9,-1,1,6,5,7,-6};
		
		int currMax = intArr[0];
		int globalMax = intArr[0];
		
		for(int i=1;i<intArr.length;i++) {
			if(intArr[i] < 0) {
				currMax = 0;
			}else {
				currMax = currMax + intArr[i];
			}
			if(globalMax < currMax) {
				globalMax = currMax;
			}
		}
		System.out.println(globalMax);
	}
}
