package com.java8.employeeQuestions;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDB {

	public static List<Employee> getEmpList(){
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101,"ABC","active","IT",340000));
		empList.add(new Employee(102,"DFE","active","IT",420000));
		empList.add(new Employee(103,"KLM","inactive","HR",540000));
		empList.add(new Employee(104,"POI","active","HR",820000));
		empList.add(new Employee(105,"GLU","inactive","IT",120000));
		empList.add(new Employee(106,"PMN","active","ADMIN",620000));
		empList.add(new Employee(107,"ERA","inactive","ADMIN",320000));

		return empList;
	}
}
