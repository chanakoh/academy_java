package com.kh.api.objExam;

import java.util.Scanner;

public class PracticeMain {
	PracticeMain ma = new PracticeMain();
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 입력");
		String str1 = sc.next();
		System.out.println("2 입력");
		String str2 = sc.next();
		
		sc.close();
		boolean isEqual = str1.equals(str2);
		System.out.println("obj와 obj2는 같은가?"+isEqual);
	
		int hashcode1 = str1.hashCode();
		int hashcode2 = str2.hashCode();
		System.out.println("obj의 해시코드"+hashcode1);
		System.out.println("obj2의 해시코드"+hashcode2);
		
		String objString = str1.toString();
		String obj2String = str2.toString();
		System.out.println("obj1의 문자열 표현"+objString);
		System.out.println("obj2의 문자열 표현"+obj2String);
		
	}
	
	
}