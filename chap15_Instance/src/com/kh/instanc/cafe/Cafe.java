package com.kh.instanc.cafe;

public class Cafe {
	String type;
	int size;
	boolean isSugar;
	
	public Cafe(String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
	}
	
	public void make() {
		System.out.println("�ֹ��Ͻ� ����� "+type+size+"������ �Դϴ�.");
		if(isSugar) {
		System.out.println("�ֹ��Ͻ� ���ῡ ������ �߰��մϴ�.");
	}
}
}
