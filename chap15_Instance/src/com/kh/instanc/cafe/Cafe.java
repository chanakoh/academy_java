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
		System.out.println("주문하신 음료는 "+type+size+"사이즈 입니다.");
		if(isSugar) {
		System.out.println("주문하신 음료에 설탕을 추가합니다.");
	}
}
}
