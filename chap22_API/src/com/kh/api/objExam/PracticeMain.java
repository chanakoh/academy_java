package com.kh.api.objExam;

import java.util.Scanner;

public class PracticeMain {
	PracticeMain ma = new PracticeMain();
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 �Է�");
		String str1 = sc.next();
		System.out.println("2 �Է�");
		String str2 = sc.next();
		
		sc.close();
		boolean isEqual = str1.equals(str2);
		System.out.println("obj�� obj2�� ������?"+isEqual);
	
		int hashcode1 = str1.hashCode();
		int hashcode2 = str2.hashCode();
		System.out.println("obj�� �ؽ��ڵ�"+hashcode1);
		System.out.println("obj2�� �ؽ��ڵ�"+hashcode2);
		
		String objString = str1.toString();
		String obj2String = str2.toString();
		System.out.println("obj1�� ���ڿ� ǥ��"+objString);
		System.out.println("obj2�� ���ڿ� ǥ��"+obj2String);
		
	}
	
	
}