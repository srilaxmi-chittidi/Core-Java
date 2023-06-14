package com.java8.streams.interviewQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import static java.util.stream.Collectors.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.streams.Employee;

public class HighestSalaryByDept {

	public static void main(String[] args) {
		List<Employee> employeeList = Stream.of(
				new Employee(1, "Anita" ,"Testing" , 250000L),
				new Employee(2, "Ram" ,"DevOps" , 350000L),
				new Employee(3, "Kriti" ,"JavaDev" , 450000L),
				new Employee(4, "Syam" ,"DevOps" , 950000L),
				new Employee(5, "Anusha" ,"JavaDev" , 850000L),
				new Employee(6, "Abarma" ,"DevOps" , 300000L),
				new Employee(7, "Chandra" ,"Testing" , 650000L),
				new Employee(8, "Amit" ,"DevOps" , 100000L)
				).collect(toList());
		
		Comparator<Employee> compareBySalary =  Comparator.comparing(Employee :: getSalary);
		
		Map<String, List<Employee>> empMapByDept = employeeList.stream().
				collect(groupingBy(Employee :: getDept));
		// approach 1
		Map<String, Optional<Employee>> highSalEmpMapByDept = employeeList.stream().
				collect(groupingBy(Employee :: getDept , 
						reducing( BinaryOperator.maxBy(compareBySalary))));

		Double avg = employeeList.stream()
        .collect(Collectors.averagingDouble(Employee::getSalary));
        
        System.out.println("Average Salary...."+avg);

		// approach 2
	/*	Map<String, Employee> highSalEmpMapByDept2 = employeeList.stream().
				collect(groupingBy(Employee :: getDept ,
						collectingAndThen(
								BinaryOperator.maxBy(Comparator.comparing(Employee :: getSalary), Optional::get))));

	*/	
		System.out.println(empMapByDept);
		System.out.println(highSalEmpMapByDept);

	}

}
