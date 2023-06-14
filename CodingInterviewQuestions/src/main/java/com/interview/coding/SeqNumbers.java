package com.interview.coding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SeqNumbers {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1,2,3,5,6,7,8,4,-5,-7,-3,-2};
		
		List<List<Integer>> seqs = new ArrayList<>();
		List<Integer> seq = new ArrayList<>();

		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]-numbers[i-1] == 1) {
				if(seq.isEmpty())
					seq.add(numbers[i-1]);
				seq.add(numbers[i]);
			}else {
				if(!seq.isEmpty()) {
					seqs.add(seq);
					seq = new ArrayList<>();
				}
			}
			if(i==numbers.length-1 && !seq.isEmpty()) {
				seqs.add(seq);
			}
		}
		seqs.stream().forEach(System.out::println);
		seqs.stream().max(Comparator.comparing(List::size)).get().forEach(x->System.out.print(x+" "));
	}

	public static List<Integer> findSeq(){
		return null;
	}
}
