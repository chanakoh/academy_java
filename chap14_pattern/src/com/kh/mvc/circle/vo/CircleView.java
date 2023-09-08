package com.kh.mvc.circle.vo;

import java.util.Scanner;

public class CircleView {

	
	public double getCircleInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("pi값을 입력하세요.");
		return sc.nextDouble();
	}
	public int getCircleInput2( ) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("반지름 값을 입력하세요.");
		return sc2.nextInt();
	}
	public void display(double result) {
		System.out.println("원의 넓이 결과 :"+result);
	}
}
