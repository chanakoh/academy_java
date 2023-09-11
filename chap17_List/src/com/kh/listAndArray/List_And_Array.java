package com.kh.listAndArray;

import java.util.ArrayList;
import java.util.List;

public class List_And_Array {
	public static void main(String[] args) {
		
		//Array 예제
		List_And_Array LAA = new List_And_Array();
		LAA.ListArray1();
		
		ListArray2();
		
	}
	public void ListArray1() {
		int[] intArray = new int[2]; // 크기가 5인 정수 배열 생성
		intArray[0] = 1;
		intArray[1] = 2;
		//intArray[2] = 3;
		//Array출력
		System.out.println("Array 요소 :");
		for(int a=0; a<intArray.length; a++) {
			System.out.println(intArray[a] + " ");
		}
	
		System.out.println();//개행문자 포함돼이썽 enter와 같은 역할
		//List 예제
		List<Integer> intList = new ArrayList<>();//integer 객체를 저장하는 Array
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//List출력
		System.out.println("List 요소 :");
		for (int num : intList) {
			System.out.println(num + " ");
		}
		
		//String로 변경 후 Array와 List 출력해보기
		List<String> stringList = new ArrayList<>();
		stringList.add("Array");
		stringList.add("List");
		
		for(String num : stringList) {
			System.out.println(num + " ");
		}
	}
	public static void ListArray2() {
		int[] intArray = new int[2]; // 크기가 5인 정수 배열 생성
		intArray[0] = 1;
		intArray[1] = 2;
		//intArray[2] = 3;
		//Array출력
		System.out.println("Array 요소 :");
		for(int a=0; a<intArray.length; a++) {
			System.out.println(intArray[a] + " ");
		}
	
		System.out.println();//개행문자 포함돼이썽 enter와 같은 역할
		//List 예제
		List<Integer> intList = new ArrayList<>();//integer 객체를 저장하는 Array
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//List출력
		System.out.println("List 요소 :");
		for (int num : intList) {
			System.out.println(num + " ");
		}
		
		//String로 변경 후 Array와 List 출력해보기
		List<String> stringList = new ArrayList<>();
		stringList.add("Array");
		stringList.add("List");
		
		for(String num : stringList) {
			System.out.println(num + " ");
		}
	}
}
