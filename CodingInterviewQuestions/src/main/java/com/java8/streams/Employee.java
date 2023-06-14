package com.java8.streams;

public class Employee {

	public Employee(int id, String name, String dept , Long salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	int id;
	String dept;
	Long salary;
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", dept=" + dept + ", salary=" + salary + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	String name;
}
