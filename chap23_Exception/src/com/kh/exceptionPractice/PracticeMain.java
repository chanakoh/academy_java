package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
			pm.ArithException();
		}
	public void ArithException() {
		// int dividend / divisor 나누었을 때예외처리
		int dividend = 100;
		int divisor = 0;
		try {
			int divi = dividend/divisor;
		}catch(ArithmeticException a) {
			System.out.println("에러발생:"+a.getMessage());
		}
		}
	public void NPException() {
		try {
			String text = "Hello World";
			String subText = null;
			int length = text.indexOf(subText);
			//indexof subtext에 있는 null 값을 포함한 문자열 검색
		}catch(NullPointerException n){
			System.out.println("오류는 :"+n.getMessage());
		}
		}
	public void NumFormatException() {
		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			System.out.println(number);	
		}catch(NumberFormatException n) {
			System.out.println("오류는 :"+n.getMessage());
		}
		}
}
