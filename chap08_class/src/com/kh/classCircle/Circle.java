package com.kh.classCircle;

public class Circle {
	//멤버변수
	final double PI = 3.14;//상수
	private int radius = 1;//변수
	
	//생성자
	public Circle() {
		//기본생성자
		}
		//메소드
		//반지름에 대해 출력
	public void inRadious() {
		//반지름 증가 증가시킬 양을 지정할 수 있다.
		radius = radius++;
	}
	public void AreaCircle() {
	//원의 넓이를 계산하고 출력하는 메소드
	double area = PI*radius*radius;
	System.out.println("원의 넓이 : "+area);
		}
	public void SizeOfCircle() {
		System.out.println("원의 크기(반지름): "+radius);
		}

}

