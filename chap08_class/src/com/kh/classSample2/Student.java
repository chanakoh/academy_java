package com.kh.classSample2;

public class Student {
	//.멤버변수(학생의 속성)
	String name;
	int age;
	String grade;
	
	/******* 생성자/생성자는 메서드중 일부 ********/
	//학생에서 이름 나이 학년을 선언할 것이다. 이름 나이학년
	public Student(String name, int age, String grade) {
		this.name=name;
		this.age=age;
		this.grade = grade;
}
//학생 정보 출력 메서드
	//학생의 정보를 이름 과 나이 학년을 출력하세요.
public void displayInfo( ) {
	System.out.println("학생 이름 :" +name);
	System.out.println("학생 나이 :" +age);
	System.out.println("학생 학년 :" +grade);
}
}