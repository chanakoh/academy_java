package com.kh.practice;
//ComparExam > User Student Actor rename
//implement Compare
public class UserStudentActor implements Comparable<UserStudentActor> {
	private String user;
	private int age;
	
	public UserStudentActor(String user, int age) {
		this.user = user;
		this.age = age;
	}
	
	@Override
	public int compareTo(UserStudentActor otherUser) {
		return this.age -otherUser.age;
	}
	@Override
	public String toString() {
		return "user name = "+user+", age= "+age;
	}

	}
