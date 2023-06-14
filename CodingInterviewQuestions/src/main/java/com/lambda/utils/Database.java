package com.lambda.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Database {

	public static List<Employee> getEmployees() {
	Employee e1 = new Employee(101, "Abc" ,230000);
	Employee e2 = new Employee(102, "Def" ,430000);
	Employee e3 = new Employee(103, "Ghi" ,130000);
	Employee e4 = new Employee(104, "Klm" ,630000);
	Employee e5 = new Employee(105, "Xyz" ,220000);
	
	List<Employee> empList = new ArrayList<>();
	empList.add(e1);
	empList.add(e2);
	empList.add(e3);
	empList.add(e4);
	empList.add(e5);
	return empList;
	}
	
	
	public static Map<Employee, Integer> getEmployeesMap() {
		Employee e1 = new Employee(101, "Abc" ,230000);
		Employee e2 = new Employee(102, "Def" ,430000);
		Employee e3 = new Employee(103, "Ghi" ,130000);
		Employee e4 = new Employee(104, "Klm" ,630000);
		Employee e5 = new Employee(105, "Xyz" ,220000);
		
		Map<Employee, Integer> empMap = new TreeMap<>();
		empMap.put(e1, 78);
		empMap.put(e2, 34);
		empMap.put(e3, 67);
		empMap.put(e4, 26);
		empMap.put(e5, 89);
		return empMap;
		}
}
