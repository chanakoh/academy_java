package com.kh.example.practice3.model.vo;

public class Circle {
	
	double PI;
	int radius;
	
	public Circle(double PI, int radius) {
		this.PI = PI;
		this.radius = radius;
		}
	
		public void incrementRadius() {
			radius++;
			System.out.println(radius);
		}
		
		public void getAreaOfCircle() {
			double area = PI*radius*radius ;
			System.out.println(area);
		}
		
		public void getSizeOfCircle() {
			System.out.println("원의 반지름"+radius);
	}
		
}
