package com.lambda.utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedEmployees {

	public static void main(String[] args) {

		List<Employee> empList = Database.getEmployees();
		//Collections.sort(empList, (o1,o2) -> (int)(o1.getSalary() - o2.getSalary()));
		
		//empList.stream().sorted((o1,o2) -> (int)(o1.getSalary() - o2.getSalary())).forEach(System.out::println);
		
		//empList.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
		
		empList.stream().sorted(Comparator.comparing(Employee :: getEmpName)).forEach(System.out::println);

		//System.out.println(empList);
	}

}
