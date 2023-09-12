package com.kh.AbstractSampel;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(String color , double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double claculaterArea() {
		return width*height;
	}
	
}
