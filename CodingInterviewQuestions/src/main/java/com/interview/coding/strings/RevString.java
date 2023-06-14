package com.interview.coding.strings;

import java.util.Arrays;

public class RevString {

	public static void main(String[] args) {
		       // System.out.println("Hello, World!");
		        String StrInput = "Hello, World!";
		        char[] inChars = StrInput.toCharArray();
		        int start =0;
		        int end = StrInput.length()-1;
		        char temp ;
		        while(start<end){
		            temp = inChars[end];
		            inChars[end] = inChars[start];
		            inChars[start] = temp;
		            start++;
		            end--;
		            
		        }
				//Arrays.stream(inChars).forEach(System.out::println);
		       System.out.println(String.valueOf(inChars));
		       Arrays.stream(StrInput.split(" ")).map(e->e.charAt(0)).forEach(System.out::println);
	}

}
