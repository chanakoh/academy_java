package com.kh.listAndArray;

import java.util.ArrayList;
import java.util.List;

public class List_And_Array {
	public static void main(String[] args) {
		
		//Array ����
		List_And_Array LAA = new List_And_Array();
		LAA.ListArray1();
		
		ListArray2();
		
	}
	public void ListArray1() {
		int[] intArray = new int[2]; // ũ�Ⱑ 5�� ���� �迭 ����
		intArray[0] = 1;
		intArray[1] = 2;
		//intArray[2] = 3;
		//Array���
		System.out.println("Array ��� :");
		for(int a=0; a<intArray.length; a++) {
			System.out.println(intArray[a] + " ");
		}
	
		System.out.println();//���๮�� ���Ե��̽� enter�� ���� ����
		//List ����
		List<Integer> intList = new ArrayList<>();//integer ��ü�� �����ϴ� Array
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//List���
		System.out.println("List ��� :");
		for (int num : intList) {
			System.out.println(num + " ");
		}
		
		//String�� ���� �� Array�� List ����غ���
		List<String> stringList = new ArrayList<>();
		stringList.add("Array");
		stringList.add("List");
		
		for(String num : stringList) {
			System.out.println(num + " ");
		}
	}
	public static void ListArray2() {
		int[] intArray = new int[2]; // ũ�Ⱑ 5�� ���� �迭 ����
		intArray[0] = 1;
		intArray[1] = 2;
		//intArray[2] = 3;
		//Array���
		System.out.println("Array ��� :");
		for(int a=0; a<intArray.length; a++) {
			System.out.println(intArray[a] + " ");
		}
	
		System.out.println();//���๮�� ���Ե��̽� enter�� ���� ����
		//List ����
		List<Integer> intList = new ArrayList<>();//integer ��ü�� �����ϴ� Array
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//List���
		System.out.println("List ��� :");
		for (int num : intList) {
			System.out.println(num + " ");
		}
		
		//String�� ���� �� Array�� List ����غ���
		List<String> stringList = new ArrayList<>();
		stringList.add("Array");
		stringList.add("List");
		
		for(String num : stringList) {
			System.out.println(num + " ");
		}
	}
}
