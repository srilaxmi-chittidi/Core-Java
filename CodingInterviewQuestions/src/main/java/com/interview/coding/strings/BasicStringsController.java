package com.interview.coding.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BasicStringsController {

	public static void main(String[] args) {
		//reverseIndivWords8("Hi Hello How are you");
		//reverseIndivWords7("Hi Hello How are you");
		//reverseWordsInString8("Hi Hello How are you");
		//reverseWordsInString7("Hi Hello How are you");
		//noOfUniqueChars8("bbbaaacaad");
		//noOfUniqueChars7("bbbaaacaad");
		//printFirstCharOfWord8("Hi Hello How are you");
		//printFirstCharOfWord7(" Pawan Kishor Singh ");
		//trimTheString8("   Pawan    Kishor   Singh");
		//trimTheString7("   Pawan Kishor Singh ");
		charOccursInString("bbbaaacaad");

	}
	//java8
	public static void reverseIndivWords8(String str) {
		List<String> words = Arrays.stream(str.split(" "))
				              .collect(Collectors.toList());
		words.stream().map(StringBuilder :: new).map(e -> e.reverse()).forEach(System.out::println);
	}
	
	
	
	// Java7
	public static void reverseIndivWords7(String str) {
		String[] words = str.split(" ");
		StringBuilder finalString = new StringBuilder();
		for(String word : words) {
			char[] allChars = word.toCharArray();
			int start = 0;
			int end = word.length()-1;
			char temp ;
			while(start<end) {
				temp = allChars[start];
				allChars[start] = allChars[end];
				allChars[end] = temp;
				start++;
				end--;
			}
			System.out.println(String.valueOf(allChars));
			finalString = finalString.append(" ").append(allChars);
		}
		System.out.println(finalString);
	}
	
	//java8
	public static void reverseWordsInString8(String str) {
		List<String> list = Arrays.stream(str.split(" ")).collect(Collectors.toList());
		Collections.reverse(list);
		System.out.println(list);
	}
	//java7
	public static void reverseWordsInString7(String str) {
		String[] strArr = Arrays.stream(str.split(" ")).toArray(String[] :: new);
		StringBuilder sb =new StringBuilder();
		for(int i= strArr.length-1 ;  i>=0 ;i--) {
			sb = sb.append(strArr[i]).append(" ");
		}
		System.out.println(sb);
	}
	//java8
	public static void noOfUniqueChars8(String str) {
		List<String> unique = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue()==1)
				.map(Map.Entry :: getKey)
				.collect(Collectors.toList());
		System.out.println(unique);
	}
	//java7
	public static void noOfUniqueChars7(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			//System.out.println(str.charAt(i));
			map.put(str.charAt(i), map.get(str.charAt(i))== null ? 1 :map.get(str.charAt(i))+1);
		}
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
	}
	//java8
	public static void printFirstCharOfWord8(String str) {
		Arrays.stream(str.split(" ")).map(e->e.charAt(0)).forEach(System.out::println);
	}
	//java7
	public static void printFirstCharOfWord7(String str) {
//		String[] words = str.split("\\s+");
//		for(String word: words) {
//			if(word.length()>0)
//			System.out.println(word.charAt(0));
//		}
		char a[] = str.toCharArray();
		for(int i=0; i<a.length;i++) {
			if(a[i]!=' ') {
				if(i==0) {
					System.out.println(a[i]);
				}else if(a[i-1] == ' ') {
					System.out.println(a[i]);
				}
			}
		}
	}
	
	//java8   
	public static void trimTheString8(String str) {
		StringBuilder result = Arrays.stream(str.split("\\s+"))
				.map(StringBuilder :: new)
				.reduce((a,b)-> (a.length() == 0) ? a.append(b) :a.append(" ").append(b))
				.get();
		System.out.println(result+"-"+result.length());
	}
	
	//java7
	public static void trimTheString7(String str) {
//		String[] strArr =  str.split("\\s+");
//		StringBuilder sb = new StringBuilder();
//		for(String st : strArr) {
//			if(sb.length() == 0) {
//				sb = sb.append(st);
//			}else {
//				sb = sb.append("+").append(st);
//			}
//		}
//		System.out.println(sb);
		
		char[] charArr = str.toCharArray();
		int start =0;
		int end = str.length() -1;
		int count =0;
		
		for(int i=0;i<charArr.length;i++) {
			if(charArr[i] != ' ') {
				start = i; break;
			}
		}
		for(int i=charArr.length-1; i >=start-1 ; i--) {
			if(charArr[i] != ' ') {
				end = i; break;
			}
		}
		count = end-start+1;
		String result = new String(charArr, start, count);
		System.out.println(result);
	}
	//Java 8
	public static void replaceCharInString8(String str,char oldChar,char newChar) {
//		StringBuilder sb = new String
//		Arrays.stream(str.split(""))
//				.map(StringBuilder :: new)
//				.map(e -> (e == oldchar)? 
	}
	
	public static void charOccursInString(String str) {
		Map<String, Long> map = 
					
					Arrays.stream(str.split(""))
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
					
		map.forEach((k,v)->System.out.println(k+" "+v));
	}
}

	
