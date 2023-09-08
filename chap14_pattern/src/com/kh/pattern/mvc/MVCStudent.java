package com.kh.pattern.mvc;

public class MVCStudent {
	//1. model
	private String name;
	private int age;
	
	
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public MVCStudent(String name, int age) {
		this.name = name;
		this.age = age;
	
	}
	//2.Controller
	public class SController{
		
	//	public Scontroller() {
			this.model = model;
			this.view = view;
		}
		
	//3.View
	public void printInfor( ) {
		System.out.println("학생들의 정보");
	}
	
	//etc. Client
	public static void main(String[] args) {
		//model 
		
		
	}

}
}