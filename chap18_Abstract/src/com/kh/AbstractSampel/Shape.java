package com.kh.AbstractSampel;
//추상클래스 정의
abstract class Shape {
	//일반 필드
	private String color;
	
	//추상 메서드(하위 클래스에서 구현해야 함)
	abstract double claculaterArea();
	//생성자
	public Shape(String color) {
		this.color = color;
	}
	
	//일반 메서드
	public void setcolor(String color) {
		this.color = color;
	}
	
	public String getcolor() {
		return color;
	}
	
	
	
	
	//public static void main(String[] args) {
		
	
	//}

}
