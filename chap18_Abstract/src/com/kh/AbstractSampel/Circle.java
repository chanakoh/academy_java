package com.kh.AbstractSampel;
//�߻� Ŭ������ �󙓹޴� ��ü���� Ŭ���� ����(���� Ŭ����)
public class Circle extends Shape {
	private double radius;
	
	//������
	public Circle(String color, double radius) {
		super(color); // �θ� Ŭ������ ������ ȣ��
		this.radius = radius;
	}
	//�߻� �޼��� ����
	@Override
	public double claculaterArea() {
		return Math.PI*radius*radius;
	}



}
