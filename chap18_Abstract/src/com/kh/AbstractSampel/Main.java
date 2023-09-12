package com.kh.AbstractSampel;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle("Red",5.0);
		System.out.println("Circle Area : "+circle.claculaterArea());
		System.out.println("Circle Color : "+ circle.getcolor());
		Rectangle r = new Rectangle("Blue",4, 4);
		System.out.println("Rectangle Area : "+r.claculaterArea());
		System.out.println("Rectangle color :"+r.getcolor());
		
	}

}
