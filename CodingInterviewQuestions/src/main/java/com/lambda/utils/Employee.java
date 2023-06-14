package com.lambda.utils;

class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private long salary;
	
	public Employee(int empId, String empName, long salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public String toString() {
		return empId+" "+empName+" "+salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.empName.compareTo(o.empName);
	}

	
}
