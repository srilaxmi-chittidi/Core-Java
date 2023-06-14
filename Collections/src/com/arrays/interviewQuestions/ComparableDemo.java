package com.arrays.interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableDemo {

	public static void main(String[] args) throws Exception {
		List<Student> studList = new ArrayList<>();
		studList.add(new Student(101,"Yashwanth"));
		studList.add(new Student(106,"Binal"));
		studList.add(new Student(104,"Kumar"));
		studList.add(new Student(102,"Aswin"));
		studList.add(new Student(103,"Surya"));
		studList.add(new Student(105,"Poonam"));
		
	//	Collections.sort(studList);
//		studList.stream().forEach(System.out::println);
		
//		Collections.sort(studList, new Comparator<Student>(){
//					public int compare(Student s1, Student s2) {
//						return s1.getName().compareTo(s2.getName());
//					}
//				});
		Collections.sort(studList, (s1,s2) -> s1.getName().compareTo(s2.getName()));
		
		studList.stream().forEach(System.out::println);
	//	studList.stream().sorted(Comparator.comparing(Student ::getName)).forEach(System.out::println);
	}
}

class Student implements Comparable<Student>{

	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return this.id+" "+this.name;
	}
	@Override
	public int compareTo(Student o) {
		return this.getId().compareTo(o.getId());
	}
	
}

