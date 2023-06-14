package com.basics.strings;

public class TrimSpacesInString {

	public static void main(String[] args) {
		TrimSpacesInString ts = new TrimSpacesInString();
		ts.printWordsWithoutWords7();
		ts.printWordsWithoutWords8();
	}
	
	public void printWordsWithoutWords7() {
		String str = "   Hello World   ";
		String[] words = str.split("\\s+");
		StringBuffer sb = new StringBuffer();
		for(String word:words) {
			sb = sb.append(word).append(" ");
		}
		System.out.println("<<"+sb+">>");
	}
	public void printWordsWithoutWords8() {
		
	}
}
