package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		//List �������̽� Linkedlist ��ü �l���ؼ� �� �ְ� ���
		//String �� �ְ� ���� ���� ���
		
		//LinkedList ��ü new LinkedList ��ü
		//int �� �ְ� ���� ���� ���
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("ù ��°");
		linkedList.add("�� ��°");
		linkedList.add("�� ��°");
		System.out.println("lL :"+linkedList);
		linkedList.remove(2);
		System.out.println("lL :"+linkedList);
		linkedList.set(1,"��°");
		System.out.println("lL :"+linkedList);
		
		LinkedList<Integer> linkedlist2 = new LinkedList<>();
		linkedlist2.add(5);
		linkedlist2.add(3);
		linkedlist2.add(2);
		System.out.println("lL2"+linkedlist2);
		linkedlist2.remove(0);
		System.out.println("lL2"+linkedlist2);
		linkedlist2.set(0,3);
		System.out.println("lL2"+linkedlist2);
		
		
	}

}
