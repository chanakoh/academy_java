package com.kh.genericsPrcatice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMain sd = new PracticeMain();
			sd.practice2();
	}
	public void practice1() {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		ArrayList<String> strList = new ArrayList<>();
		strList.add("나는");
		strList.add("모른다");
		
		printList(intList);
		printList(strList);
	}
	public static <T> void printList(ArrayList<T> list) {
		for(T item : list) {
			System.out.println(item);
		}
	
}
	public void practice2() {
		//Box 객체를 com.kh.gebericsparctice 밑에 생성
		//정수형 데이터를 저장하는 box인스턴스 생성
		//문자열 데이터를 저장하는 box인스턴스 생성
		//각각출력
		//향상된 for문이용해서 값 모두 출력
		Box<Integer> intBox = new Box<>();
		intBox.put(50);
		intBox.put(40);
		int intValue = intBox.get();
			
		
		Box<String> strBox = new Box<>();
		strBox.put("월");
		strBox.put("화");
		strBox.put("수");
		String strgood = strBox.get();
		
		System.out.println(intValue);
		System.out.println(strgood);
	}
}
