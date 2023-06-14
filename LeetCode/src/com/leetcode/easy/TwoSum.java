package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = new int[] {2,3,4,8,1,6};
		int target =16;
		int[] value = twoSum(nums,target);
		Arrays.stream(value).forEach(System.out::println);
	}
	
    
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for(int i=0; i<nums.length ; i++) {
			
			int complement = target - nums[i];
			if(numMap.containsKey(complement)) {
				return new int[] { numMap.get(complement),i };
			}
			numMap.put(nums[i],i);
		}
		return new int[] {};
		//throw new IllegalArgumentException();
	}

}
/**Two Sum 
Given an array of integers nums and an integer target , return indices
of the two numbers such that they add up to target

You may assume that each input would have exactly one solution, and
you may not use the same element twice.
You can return the answer in any order.*/