package com.kh.mvc.circle.vo;

import java.util.Scanner;

public class CircleView {

	
	public double getCircleInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("pi���� �Է��ϼ���.");
		return sc.nextDouble();
	}
	public int getCircleInput2( ) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("������ ���� �Է��ϼ���.");
		return sc2.nextInt();
	}
	public void display(double result) {
		System.out.println("���� ���� ��� :"+result);
	}
}
