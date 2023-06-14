package com.interview.coding.integers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/NumberOps")
public class IntegerOperations {


		@GetMapping("/getSum")
		public int getSumOfNums(){
		
			List<Integer> list = Arrays.asList(1,4,5,3,2,56,12,3,2,6);
			return list.stream().reduce((a,b) -> a+b).get();
		}

		@GetMapping("/getAvg")
		public double getAvgOfNums(){
		
			List<Integer> list = Arrays.asList(1,4,5,3,2,56,12,3,2,6);
			return  list.stream().mapToInt(e->e).average().getAsDouble();
		}
		
		//Get average number of squares which is greater that 100
		@GetMapping("/getSqauresAvg")
		public double getSquaresAvg() {
			List<Integer> list = Arrays.asList(1,10,20,30,15);
			return list.stream()
						.map(e -> e*e)					// square of each value
							.filter(e -> e>100)			// filter those who are greater than 100
								.mapToInt(e->e)			// convert to integer
									.average()
										.getAsDouble();
			
			
		}
		
		@GetMapping("/getEvenNums")
		public List<Integer> getEvenNumbers(){
			List<Integer> list = Arrays.asList(1,4,5,3,2,56,12,3,2,6);
			
			return list.stream()
						.filter(e -> e%2==0)
							.collect(Collectors.toList());
		}
		

		@GetMapping("/getOddNums")
		public List<Integer> getOddNumbers(){
			List<Integer> list = Arrays.asList(1,4,5,3,2,56,12,3,2,6);
			
			return list.stream()
						.filter(e -> e%2!=0)
							.collect(Collectors.toList());
		}
		
		@GetMapping("/getPrefixWith2")
		public List<Integer> getNumsStartsWith2(){
			List<Integer> list = Arrays.asList(1,4,5,23,2,56,12,23,2,6);
			
			return list.stream()
						.map(e -> String.valueOf(e))
						.filter(e -> e.startsWith("2"))
						.map(Integer ::valueOf)
						.collect(Collectors.toList());
		}
		@GetMapping("/getMax")
		public int getMaxVal() {
			List<Integer> list = Arrays.asList(1,4,5,23,2,56,12,23,2,6);
			return list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		}
		@GetMapping("/getMin")
		public int getMinVal() {
			List<Integer> list = Arrays.asList(1,4,5,23,2,56,12,23,2,6);
			return list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		}
		
		@GetMapping("/getSortedOrder")
		public List<Integer> getSorterOrder() {
			List<Integer> list = Arrays.asList(1,4,5,23,2,56,12,23,2,6);
			return list.stream().sorted().collect(Collectors.toList());
		}
		@GetMapping("/getDescendingOrder")
		public List<Integer> getDescOrder() {
			List<Integer> list = Arrays.asList(1,4,5,23,2,56,12,23,2,6);
			return list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		}
		@GetMapping("/getFirst5NumsSum")
		public int getFirst5NumsSum() {
			List<Integer> list = Arrays.asList(1,4,5,23,2,56,12,23,2,6);
			return list.stream().limit(5).reduce((a,b)->a+b).get();
		}
		

		@GetMapping("/getSecondHighest")
		public int getSecondHighest() {
			List<Integer> list = Arrays.asList(1,4,5,23,2,56,12,23,2,6);
			return list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		}
		@GetMapping("/getLowest")
		public int getLowest() {
			List<Integer> list = Arrays.asList(1,4,5,23,2,56,12,23,2,6);
			return list.stream().sorted().distinct().skip(1).findFirst().get();
		}
}


