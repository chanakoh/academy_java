package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
			pm.ArithException();
		}
	public void ArithException() {
		// int dividend / divisor �������� ������ó��
		int dividend = 100;
		int divisor = 0;
		try {
			int divi = dividend/divisor;
		}catch(ArithmeticException a) {
			System.out.println("�����߻�:"+a.getMessage());
		}
		}
	public void NPException() {
		try {
			String text = "Hello World";
			String subText = null;
			int length = text.indexOf(subText);
			//indexof subtext�� �ִ� null ���� ������ ���ڿ� �˻�
		}catch(NullPointerException n){
			System.out.println("������ :"+n.getMessage());
		}
		}
	public void NumFormatException() {
		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			System.out.println(number);	
		}catch(NumberFormatException n) {
			System.out.println("������ :"+n.getMessage());
		}
		}
}
