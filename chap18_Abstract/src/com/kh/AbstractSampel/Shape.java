package com.kh.AbstractSampel;
//�߻�Ŭ���� ����
abstract class Shape {
	//�Ϲ� �ʵ�
	private String color;
	
	//�߻� �޼���(���� Ŭ�������� �����ؾ� ��)
	abstract double claculaterArea();
	//������
	public Shape(String color) {
		this.color = color;
	}
	
	//�Ϲ� �޼���
	public void setcolor(String color) {
		this.color = color;
	}
	
	public String getcolor() {
		return color;
	}
	
	
	
	
	//public static void main(String[] args) {
		
	
	//}

}
