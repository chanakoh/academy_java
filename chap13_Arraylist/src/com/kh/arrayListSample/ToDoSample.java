package com.kh.arrayListSample;

import java.util.ArrayList;
/*
 * toDoSample.java
 * ArrayList �̿��ؼ� ���� 3������� 2�������ϰ� 1������� ���δ� ����
 * */
public class ToDoSample {

	public static void main(String[] args) {
		ArrayList<String> work = new ArrayList<>();
		
		work.add("������");
		work.add("û��");
		work.add("����");
		System.out.println("���� ��� : "+work);
		
		work.set(0,"����");
		work.set(1,"��Ա�");
		System.out.println("����� ��� : "+work);
		
		work.remove(1);
		System.out.println("���� �� ��� : "+work);
		for(String aa : work) {
			System.out.println("���ϸ�� :"+aa);
		}
		work.clear();
		System.out.println("���� ���� �� ��� : "+work);
	}

}
