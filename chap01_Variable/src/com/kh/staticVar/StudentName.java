package com.kh.staticVar;

public class StudentName {
	public static void main(String[] args) {
		StaticVar stkim = new StaticVar();
		stkim.setStudentName("kh�л�1");
		System.out.println(stkim.serialNum);
		stkim.serialNum++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("kh�л�2");
		System.out.print("kh�л�1:");
		System.out.println(stkim.serialNum);
		System.out.print("kh�л�2:");
		System.out.println(khLee.serialNum);
		}
}
//��Ÿƽ����� �ö󰣰��� �ٸ� Ŭ������ �̾�������