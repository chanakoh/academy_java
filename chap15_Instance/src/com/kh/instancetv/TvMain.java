package com.kh.instancetv;

public class TvMain {

	public static void main(String[] args) {
			Tv tv; //Tv인스턴스를 참조하기위해서 변수 tv선언
			tv = new Tv(); //tv인스턴스 생성 객체의 주소를 참조변수에 저장
			//Tv tv1 = new Tv();
			
			tv.channel = 7; // tv인스턴스의 멤버변수 channel의 값을 7로 설정
			tv.channelDown(); // tv인스턴스의 메서드 channelDown을 호출
			tv.power();
			System.out.println("Channel"+tv.channel);
	}

}
