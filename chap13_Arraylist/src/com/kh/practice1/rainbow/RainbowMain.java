package com.kh.practice1.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		ArrayList<String> rainbow = new ArrayList<>();
		rainbow.add("����");
		rainbow.add("��Ȳ");
		rainbow.add("���");
		rainbow.add("�ʷ�");
		rainbow.add("�Ķ�");
		rainbow.add("��");
		rainbow.add("����");
		System.out.println("������ ���� :"+rainbow);
		rainbow.set(1,"��");
		rainbow.set(3,"����");
		rainbow.set(5,"�׸�");
		System.out.println("���� ������ ���� : "+rainbow);
		rainbow.add(2,"���ο�");
		rainbow.add(7,"�����Ķ�");
		System.out.println("�߰� ������ ���� : "+rainbow);
		for(String rainbow1 : rainbow ) {
			System.out.println(rainbow1);
		}
		System.out.println(rainbow.get(0)+rainbow.get(5)+rainbow.get(8));
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(2);
		rainbow.remove(2);
		System.out.println(rainbow);
	}

	}

