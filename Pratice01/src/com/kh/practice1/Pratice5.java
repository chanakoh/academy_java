package com.kh.practice1;

import java.util.Scanner;

public class Pratice5 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    String name;
	    System.out.println("���ڿ��� �Է��ϼ��� : ");
	    name = sc.nextLine();
	    
	    char first = name.charAt(0); // ���ڸ� 1�ھ� ����
	    //���ڸ��� ���� ������ apple 1�ڰ� �Ѿ ����� �� �� ����, �ڸ� ��ġ ���ؼ� ����ϱ�
	    // System.out.println("index 1��° �ڸ� : " + first);
	    char second = name.charAt(1);//indexNum2
	    char third = name.charAt(2);
	    
	    //String p1 = name.substring(2,3); 
	    //���ڸ��� �ƴ϶� �ڸ��� �����ؼ� ����� �� ����
	    // ���۸� ���ص� �ǰ�, ���� ���ص���
	    //�ڶ� ��ġ ���ؼ�����ϱ�
	    //���۸� �ۼ��� ��� ������ �ε������� ������ ���
	    
	    System.out.println("ù ��° ���� : " + first);
		System.out.println("�� ��° ���� : " + second);
		System.out.println("�� ��° ���� : " + third);
		//System.out.println("substring : " + p1);
}
}
