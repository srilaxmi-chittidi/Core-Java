package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(108,"bhc"));
		empList.add(new Employee(108,"aol"));
		empList.add(new Employee(105,"urc"));
		empList.add(new Employee(101,"htc"));
		Collections.sort(empList,new IdComparator());
		System.out.println(empList);
	//	Collections.sort(empList,new NameComparator());
	//	System.out.println(empList);
	}
}
@Getter
@Setter
@ToString
@AllArgsConstructor
class Employee {
	private int id;
	private String name;
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}
class IdComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getId()-o2.getId();
	}
}

class NameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
