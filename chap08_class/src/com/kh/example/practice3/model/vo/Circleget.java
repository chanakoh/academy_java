package com.kh.example.practice3.model.vo;

public class Circleget {
	int radius=1; 
	double PI=3.14;
	
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	public void setPI(double pI) {
		PI = pI;
	}
	public void setRadius(int radius) {
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