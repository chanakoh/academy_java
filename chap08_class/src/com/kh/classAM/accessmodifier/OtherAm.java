package com.kh.classAM.accessmodifier;

public class OtherAm {
	public static void main(String[] args) {
		AM am = new AM();
		am.publicMethod();
		am.protectedMethod();
		am.defaultMethod();
		//am.privateMethod(); // 다른 클래스에 존재하기때문에 미출력
	}
	//AM 생성
	
}
