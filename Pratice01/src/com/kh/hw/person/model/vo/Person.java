package com.kh.hw.person.model.vo;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {}
	public Person(String name, int age, double height, double weight) {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = 20;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = 80.5;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = 180.5;
	}
	public void inform() {
		
	}
	
	}
