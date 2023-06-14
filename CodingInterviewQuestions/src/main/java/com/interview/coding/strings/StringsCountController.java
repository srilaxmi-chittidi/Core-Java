package com.interview.coding.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringsCountController {

	@GetMapping("/getVowelCount/{str}")
	public Long getCount(@PathVariable String str) {
		
		IntPredicate vowels = new IntPredicate() {
			@Override
			public boolean test(int t) {
				return (t == 'a' || t == 'e' || t == 'i' || t =='o' || t == 'u'
						|| t == 'A' || t == 'E' || t == 'I' || t =='O' || t == 'U');
			}
		};
		return str.chars().filter(vowels).count();
	}
	
	@GetMapping("/getNoOfCharOccr/{str}/{c}")
	public Long getCharOccur(@PathVariable String str,@PathVariable char c) {
		return str.chars().filter(e -> (char)e == c).count();
	}
	
	@GetMapping("/getWordsCount")
	public Map<String, Long> getWordOccurs(@RequestBody String str ){
		
		String strg ="Rain, rain, go away\r\n"
				+ "Come again some other day\r\n"
				+ "We want to go outside and play\r\n"
				+ "Come again some other day\r\n"
				+ "Rain, rain, go away\r\n"
				+ "Come again some other day\r\n"
				+ "We want to go outside and play\r\n"
				+ "Come again some other day\r\n"
				+ "Rain, rain, go away\r\n"
				+ "Come again some other day\r\n"
				+ "We want to go outside and play\r\n"
				+ "Come again some other day";
		List<String> list = Arrays.asList(str.split(" "));
		return list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}
	
	@GetMapping("/checkMidStrgOrNot/{str}/{fullWord}")
	public boolean checkMidStrgOrNot(@PathVariable String str,@PathVariable String fullWord) {
		int strLength = str.length();
		char[] charArr = str.toCharArray();
		Map<Character ,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<charArr.length; i++) {
			map.put(charArr[i], fullWord.indexOf(charArr[i]));
			//System.out.println(charArr[i]+" "+fullWord.indexOf(charArr[i]));
		}
		map.entrySet().stream().forEach(System.out::println);
		return false;
	}
}
