package com.java8.streams;

import java.util.List;

public class Users {

	public Users(int id, String name, List<String> email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	String name;
	List<String> email;
}
