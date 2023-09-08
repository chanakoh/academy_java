package com.kh.mvc.person.mo;

public class PersonModel {
	private String name;
	private int number;
	public PersonModel(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	
	
	}
