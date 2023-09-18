package com.kh.practice;

import java.util.ArrayList;
import java.util.List;

import chap28_Comparable.Person;

public class User {
	public static void main(String[] args) {
		List<UserStudentActor> user = new ArrayList<>();
		user.add(new UserStudentActor("a", 78));
		user.add(new UserStudentActor("b", 79));
		user.add(new UserStudentActor("c", 71));

		for(UserStudentActor a : user) {
			System.out.println(a);
		}
}
}
