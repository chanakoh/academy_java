package com.kh.api.objExam;

public class StringBuilderMain {
/*
 StringBuilder
 	���ڿ��� ȿ�������� ������ �� �ְ� ���ִ� Ŭ����
 	���ڿ��� ������ ������ ���ο� ���ڿ� ��ü�� �����ϴ°� �ƴ϶� ���� ���ڿ��� �����ϴ� ������� ����, �޸𸮻���� ȿ�����̰� ��
 * */
	public static void main(String[] args) {
		StringBuilder strBuilder = new StringBuilder();
		
		//aapend �޼��带 ����Ͽ� ���ڿ� �߰�
		strBuilder.append("Hello, ");
		strBuilder.append("World");
		
		String result = strBuilder.toString();
		System.out.println(result);
		//���ڿ� ����
		strBuilder.insert(7, "Java");//7�� ° ��ġ�� Java ����
		System.out.println(strBuilder.toString());
		
		//���ڿ� ����
		strBuilder.delete(7, 12);
		System.out.println(strBuilder.toString());
		
		//���ڿ� ��ü
		strBuilder.replace(7, 12,"JAVA �ְ���!!");
		System.out.println(strBuilder.toString());
		
		//���ڿ� ����
		strBuilder.reverse();
		System.out.println(strBuilder.toString());
	}

}