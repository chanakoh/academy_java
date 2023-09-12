package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		//List 인터페이스 Linkedlist 객체 홯용해서 값 넣고 출력
		//String 값 넣고 수정 삭제 출력
		
		//LinkedList 객체 new LinkedList 객체
		//int 값 넣고 수정 삭제 출력
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("첫 번째");
		linkedList.add("두 번째");
		linkedList.add("세 번째");
		System.out.println("lL :"+linkedList);
		linkedList.remove(2);
		System.out.println("lL :"+linkedList);
		linkedList.set(1,"번째");
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
