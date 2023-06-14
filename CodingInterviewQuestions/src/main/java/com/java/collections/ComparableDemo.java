package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ComparableDemo {
	public static void main(String[] args) {
		List<Student> studList = new ArrayList<>();
		studList.add(new Student(108,"bhc",456,"C"));
		studList.add(new Student(103,"aol",534,"B"));
		studList.add(new Student(105,"urc",873,"A+"));
		studList.add(new Student(101,"htc",234,"D"));
		Collections.sort(studList);
		System.out.println(studList);
	}
}
@Getter
@Setter
@ToString
@AllArgsConstructor
class Student implements Comparable<Student>{

	@Override
	public int compareTo(Student o) {
		return this.id-o.id;
	}
	
	private int id;
	private String name;
	private int marks;
	private String grade;
}
