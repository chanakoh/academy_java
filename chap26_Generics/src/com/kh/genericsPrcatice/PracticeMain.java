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
		strList.add("����");
		strList.add("�𸥴�");
		
		printList(intList);
		printList(strList);
	}
	public static <T> void printList(ArrayList<T> list) {
		for(T item : list) {
			System.out.println(item);
		}
	
}
	public void practice2() {
		//Box ��ü�� com.kh.gebericsparctice �ؿ� ����
		//������ �����͸� �����ϴ� box�ν��Ͻ� ����
		//���ڿ� �����͸� �����ϴ� box�ν��Ͻ� ����
		//�������
		//���� for���̿��ؼ� �� ��� ���
		Box<Integer> intBox = new Box<>();
		intBox.put(50);
		intBox.put(40);
		int intValue = intBox.get();
			
		
		Box<String> strBox = new Box<>();
		strBox.put("��");
		strBox.put("ȭ");
		strBox.put("��");
		String strgood = strBox.get();
		
		System.out.println(intValue);
		System.out.println(strgood);
	}
}
