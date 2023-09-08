package com.kh.pattern.mvc.Model;

public class UserModel {
	private String name;
	private int age;
	
	public UserModel(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		/* 1.�л� ���� ǥ��
		 * private �̸� ����
		 * getter setter �����
		 */
	}
}
