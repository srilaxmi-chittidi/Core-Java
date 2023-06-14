package com.java8coding.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class MapFromListGroupingBy {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		Employee e1 = new Employee(101,"A","IT",100000L);
		Employee e2 = new Employee(102,"B","Med",300000L);
		Employee e3 = new Employee(103,"C","HR",400000L);
		Employee e4 = new Employee(104,"D","Med",250000L);
		Employee e5 = new Employee(105,"E","IT",500000L);
		Employee e6 = new Employee(106,"F","HR",200000L);
		empList.add(e6);empList.add(e5);empList.add(e4);
		empList.add(e3);empList.add(e2);empList.add(e1);
		
		Map<String List<Employee>> map1 = empList.stream().collect(Function.identity,Collections.toList());
		
		//Map<String,List<Employee>> map = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()));
		//map.forEach((k,v) -> System.out.println(k+" "+v));
	}

}
@Setter
@Getter
//@AllArgsConstructor
class Employee{
	public Employee(int empNo, String empName, String dept, long salary) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept= dept;
		this.salary =salary;
	}
	int empNo;
	public String toString() {
		return this.empNo+" "+this.empName+" "+this.dept+" "+this.salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	String empName;
	String dept;
	long salary;
}