package com.basics.strings;
public class FirstLetterInEachWord {

	public static void main(String[] args) {
		FirstLetterInEachWord fw = new FirstLetterInEachWord();
		fw.FirstLetterBeforeJava8();
		System.out.println("<------------------------->");
		fw.FirstLetterAfterJava8();
	}

	public void FirstLetterBeforeJava8() {
		String str = "Hello World";
		char[] c = str.toCharArray();
		for(int i=0;i<c.length-1;i++) {
			if(c[i] != ' ' && (i==0 || c[i-1] == ' ')) {
				System.out.println(c[i]);
			}
		}
	}
	
	public void FirstLetterAfterJava8() { 
		String str = "Hello world";
		String[] words = str.split(" ");
		for(String word : words) {
			System.out.println(word.charAt(0));
		}
		
	}
}
