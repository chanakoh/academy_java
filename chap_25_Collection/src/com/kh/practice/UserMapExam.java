package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserMapExam {

	public static void main(String[] args) {
		// HashMap ���� UserAge
		//������ �̸��� ����
		//Ư�� ���� �˻�
		//��� �л��� ���� ���
		//���� ���� ����
		//���� Ż��
		//���� ���� �̸� ���� ���
		
		Map<String, Integer> User = new HashMap<>();
		User.put("�达",60);
		User.put("�ھ�",58);
		User.put("�̾�",63);
		User.put("�־�",62);
		User.put("����",61);
		
		String userName = "�达";
		if(User.containsKey(userName)) { 
			int age = User.get(userName);
			System.out.println("�ش� ������ �̸���"+userName+"�Դϴ�.");
		}
		System.out.println("��� ������ �̸��� ���� ���");
		for(Map.Entry<String,Integer> entry : User.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name+":"+age);
		}
		String UserUpdate = "�达";
		int newAge = 20;
		User.put(UserUpdate,newAge);
		System.out.println(UserUpdate+"�� ���̸� "+newAge+"�� �����մϴ�.");
	
		String removeUser = "����";
		User.remove(removeUser);
		System.out.println(removeUser+"�� ���ŵǾ����ϴ�.");
	
		System.out.println("���� ���� ���� ���");
		for(Map.Entry<String,Integer> entry : User.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name+":"+age);
	}
	
	}
}
