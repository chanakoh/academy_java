package com.kh.api.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticeMain4 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		PracticeMain4 sd = new PracticeMain4();
		sd.practice4();
		
	}
	public void practice1() {
		
	}
	public void practice2() {
		//��¥���� ���
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formatStr = String.format("���糯¥ : %s",smDateFormat.format(currentDate));
		System.out.println(formatStr);
	}
	public void practice3() {
		int num1 = 123;
		int num2 = 7;
		//���ڰ� ������ ���̺��� ª�� ��� �տ� 0���� ä���ְڴ�.
		//��µǴ� ������ �ּ� �ʺ� �ڸ� 5�ڸ��� �ϰ�ʹ�
		String str = String.format("����1:%01d , ����2:%d ",num1,num2);
		System.out.println(str);
	}
	public void practice4() {
		String text1 = "Hello";
		String text2 = "World";
		//10�� �ּ� �ʺ� �ּ� 10�ڸ��� ������ ����
		//���� ���ڿ��� 10�ڸ����� ª�ٸ� ���ʿ� �������� ä����
		//���� ���ڿ��� -10�ڸ����� ª�ٸ� �����ʿ� �������� ä����
		//'����ǥ�� �ѷ��׾ƾ���
		String formatStr = String.format("%-10s %10s",text1, text2);
		System.out.println(formatStr);
	}
}
