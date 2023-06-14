package com.java8.employeeQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeDetails {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeDB.getEmpList();
		//getEmpDetailsByDept(empList);
		//getEmpCountByDept(empList);
		//getEmpStatus(empList);
		//getMinMaxSal(empList);
		getMaxSalEmpByDept(empList);
	}
	
	public static void getEmpDetailsByDept(List<Employee> empList){
		Map<String,List<Employee>> empMap = empList.stream()
				.collect(Collectors.groupingBy(Employee :: getDept, Collectors.toList()));
		printMap(empMap);
		//empMap.entrySet().stream().forEach(System.out::println);
		}
	
	public static void getEmpCountByDept(List<Employee> empList){
		
		  Map<String,Long> empMap = empList.stream() 
				  .collect(Collectors.groupingBy(Employee :: getDept ,Collectors.counting())) ;
			printMap(empMap);
		 // empMap.entrySet().stream().forEach(System.out::println);
		}

	public static void getEmpStatus(List<Employee> empList){
		Map<String,List<Employee>> empMap = empList.stream()
				.collect(Collectors.groupingBy(Employee::getStatus, Collectors.toList()));
		printMap(empMap);
		//empMap.entrySet().stream().forEach(System.out::println);
	}

	public static void getMinMaxSal(List<Employee> empList){
		String empName = empList.stream().max(Comparator.comparing(Employee :: getSalary)).get().getEmpName();
		System.out.println(empName);
		
		empList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))).ifPresent(System.out::println);
	}
	
	public static void getMaxSalEmpByDept(List<Employee> empList){
		Map<String, Optional<Employee>> empMap = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDept,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
	
		Map<String, Optional<Employee>> maxSal = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDept,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		printMap(empMap);

		//maxSal.entrySet().stream().forEach(System.out::println);
	}

	
	public static <K,L> void printMap(Map<K,L> map) {
		map.entrySet().stream().forEach(System.out::println);

	}
	
}
