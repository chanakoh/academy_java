package com.kh.staticVar;

public class StudentName {
	public static void main(String[] args) {
		StaticVar stkim = new StaticVar();
		stkim.setStudentName("kh학생1");
		System.out.println(stkim.serialNum);
		stkim.serialNum++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("kh학생2");
		System.out.print("kh학생1:");
		System.out.println(stkim.serialNum);
		System.out.print("kh학생2:");
		System.out.println(khLee.serialNum);
		}
}
//스타틱여기사 올라간게은 다른 클래스에 이어지는지