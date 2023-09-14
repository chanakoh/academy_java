package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		exmain.ExceptionExam();
	}
	public void ExceptionA() {
		try {
			int result = 10/0; //0으로 나누는 시도
			System.out.println("Result :"+result);	
		}catch(ArithmeticException e) {
			/*
			 ArithmeticException 수학적인 계산 과정에서 발생하는 오류
			 ArithmeticException e : e는 우리가 지정한 변수명
			 e로 지정한 변수로 메세지를 getMessage()로 전달 받는다.
			 * */
			System.out.println("산술 연산으로 인해 발생한 에러!!"+e.getMessage());
		}
	}
	public void ExceptionB() {
		
		
	}
	public void ExceptionN() {
		try {
			String text = null;
			int length = text.length();
			//내용이 없는데 text로부터 문자열의 길이를 얻기
			System.out.println("문자열 길이:"+text);	
		}catch(NullPointerException e) {
			System.out.println("문자열이 비어서 발생한 에러!"+e.getMessage());
		}
		
	}
	public void ExceptionF() {
		try {
			String juminNumber = "공오공904";
			int number = Integer.parseInt(juminNumber);//문자열을 정수로 변환 시도
			System.out.println("숫자 :"+number);	//안에String이 들어있기 때문에 실행이 되지 않음
		}catch(NumberFormatException n) {
			System.out.println("숫자로쓰세요"+n.getMessage());
		}
		
	}
	public void ExceptionExam() {
	try {
		int[] numbers = {1,2,3,4,5};
		int index = 7;//유효하지 않은 인덱스 넘버
		int result = numbers[index];//배열 요소에 접근
		System.out.println("Result :"+result);
	}catch(ArrayIndexOutOfBoundsException e) {
		//배열 인덱스가 범위를 벗어났을 때 발생하는 예외 처리
		System.out.println("배열 인덱스 범위를 벗어나 예외가 발생!"+e.getMessage());
	}catch(Exception e) {
		//다른 예외를 처리할 수 있는 예외 처리
		System.out.println("배열 인덱스 범위를 벗어난 예외가 아닌 일반적인 다른 예외 발생");
	}finally {
		//항상 실행되는 블록
		System.out.println("finally 등장!");
	}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
