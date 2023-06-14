package com.lambda.utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortedMapEmployees {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("nine", 9);
		map.put("two", 2);
		map.put("five", 5);
		
		List<Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
		//Collections.sort(entryList , (o1,o2)->(o1.getKey().compareTo(o2.getKey())));
		
		//entryList.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		/*for(Entry<String, Integer> entry : entryList) {
			System.out.println(entry.getKey() +" "+entry.getValue());
		}*/
		Map<Employee , Integer> empMap = Database.getEmployeesMap();
		empMap.entrySet().stream()
			.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmpName)))
			.forEach(System.out::println);
	}

}
