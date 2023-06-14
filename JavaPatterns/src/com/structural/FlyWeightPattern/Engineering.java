package com.structural.FlyWeightPattern;

import java.util.HashMap;
import java.util.Random;

class EmployeeFactory {
	
	private static HashMap<String,Employee> m = new HashMap<String,Employee>();
	
	public static Employee getEmployee(String type) {
		Employee p = null;
		if(m.get(type) != null) {
			p = m.get(type);
		}else {
			switch(type) {
			case "Developer" :
					System.out.println("Developer created");
					p = new Developer();
					break;
			case "Tester" :
					System.out.println("Tester created");
					p = new Tester();
					break;
			default :
					System.out.println("No such Employee");
			}
			m.put(type, p);
		}
		return p;
	}

}
 interface Employee{
	 public void assignSkill(String skill);
	 public void task();
 }
 class Developer implements Employee{
	private final String JOB;
	private String skill;
	public Developer() {
		this.JOB = "Fix this issue";
	}
	@Override
	public void assignSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public void task() {
		System.out.println("Developer with this skill :"+skill+" with this job "+JOB);
	}
 }
 class Tester implements Employee{
		private final String JOB;
		private String skill;
		public Tester() {
			this.JOB = "Test this issue";
		}
		@Override
		public void assignSkill(String skill) {
			this.skill = skill;
		}
		@Override
		public void task() {
			System.out.println("Tester with this skill :"+skill+" with this job "+JOB);
		}
	 }
 
 public class Engineering{
	 private static String employeeType[] = {"Developer","Tester"};
	 private static String skills[] = {"Java",".NET","C","C++"};
	 
	 public static void main(String args[]) {
		 for(int i=0;i<10;i++) {
			 Employee e = EmployeeFactory.getEmployee(getRandomEmployee());
			 e.assignSkill(getRandomSkill());
			 e.task();
		 }
	 }

	private static String getRandomSkill() {
		Random s = new Random();
		int intSkill = s.nextInt(skills.length);
		return skills[intSkill];
	}

	private static String getRandomEmployee() {
		Random e = new Random();
		int intEmp = e.nextInt(employeeType.length);
		return employeeType[intEmp];
	}
 }
 
 