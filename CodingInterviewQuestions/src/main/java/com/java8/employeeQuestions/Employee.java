package com.java8.employeeQuestions;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2209161605956551632L;
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	private long empId;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", status=" + status + ", dept=" + dept
				+ ", salary=" + salary + "]";
	}
	public Employee(long empId, String empName, String status, String dept, long salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.status = status;
		this.dept = dept;
		this.salary = salary;
	}
	private String empName;
	private String status;
	private String dept;
	private long salary;
}
