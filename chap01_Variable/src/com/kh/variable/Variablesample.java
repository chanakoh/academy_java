package com.kh.variable;

public class Variablesample {
	public static void main(String[] args) {
		String name;
		name = "쿠팡";
		int hour = 15;
		
		double score = 90.5;
		char grade = 'A';
		System.out.println("안녕하세요."+ name +"입니다. 오늘"+ hour+"에 배송됩니다.");
		System.out.println("저의 성적은"+score+"입니다.");
		System.out.println(score + "은"+grade+"입니다.");
		
		//변수에 이름과 나이와 자신의 성적(double)로 넣기
		String name2;
		name2 = "고병찬";
		int age = 32;
		double score2 = 90.5;
		char grade2 = 'A';
		System.out.println("저의 이름은"+name2+"입니다.");
		System.out.println("저의 나이는"+age+"입니다.");
		System.out.println("저의 성적은"+score2+"입니다.");
		System.out.println("저의 등급은"+grade2+"입니다.");
		
	}
}
