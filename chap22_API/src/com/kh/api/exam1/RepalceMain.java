package com.kh.api.exam1;

public class RepalceMain {

	public static void main(String[] args) {
		RepalceMain m = new RepalceMain();
		//m.replace1();
		m.replace3();
		m.replace4();
		m.replace5();
		m.replaceAll();
		
	}
	public void replace1() {
		String input = "Hello, world";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-", "");
		System.out.println("input2: "+input2);
	}
	public void replace2( ) {
		String input = "Hello World";
		//World를 Java로 교체
		String reInput = input.replace("World","Java");
		System.out.println(reInput);
	}
	public void replace3() {
		String originName = "Hello world";
		String reInput = originName.replace("o", "x");
		System.out.println(reInput);
		//o로 적혀있는 문자열들 x로 변경하기
	}
	public void replace4() {
		String originString = "The quick brown fox jups overthe lazy dog";
		String reInput = originString.replace("for", "cat");
		System.out.println(reInput);
	}
	public void replace5( ) {
		String originString = "The quick brown fox jups overthe lazy dog";
		String reInput = originString.replace(" ", "");
		System.out.println(reInput);
		//모든 공백 제거하기
	}
	public void replaceAll() {
		String originString ="Hello World";
		//replcae대신 replceAll을 이용해서 대소문자 구분없이 문자열 치환하기
		String reAllstr = originString.replaceAll("(?i)world","java");
		System.out.println(reAllstr);
	}

}
