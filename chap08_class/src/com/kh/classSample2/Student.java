package com.kh.classSample2;

public class Student {
	//.�������(�л��� �Ӽ�)
	String name;
	int age;
	String grade;
	
	/******* ������/�����ڴ� �޼����� �Ϻ� ********/
	//�л����� �̸� ���� �г��� ������ ���̴�. �̸� �����г�
	public Student(String name, int age, String grade) {
		this.name=name;
		this.age=age;
		this.grade = grade;
}
//�л� ���� ��� �޼���
	//�л��� ������ �̸� �� ���� �г��� ����ϼ���.
public void displayInfo( ) {
	System.out.println("�л� �̸� :" +name);
	System.out.println("�л� ���� :" +age);
	System.out.println("�л� �г� :" +grade);
}
}