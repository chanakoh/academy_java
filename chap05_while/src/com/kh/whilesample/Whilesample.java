package com.kh.whilesample;

public class Whilesample {

	public static void main(String[] args) {
		// While문
		/*
		 특정 조건이 참인 동안에 반복적으로 코드 불록을 실행하는 제어 구조
		 조건이 참인지 거짓인지 검사한후 조건이 참인동안 코드블록이 반복적으로 실행
		 조건이 거짓이면, 반복이 중지
		 
		 while문의 특징:
		 while문의 조건이 참인 동안 코드블록을 계속해서 반복적으로 실헹한다.
		 조건이 처음부터 거짓이면 코드 블록은 실행되지 않음.
		 조건이 항상 참이라면 무한 루프에 빠질 수 있으므로 조심해야함.
		 코드블록 실행 전에 검사하기 때문에 조건이 처음부터 거짓이면 실행되지 않는다.
		 while(조건){
		 	//조건이 참인 동안 실행될 코드
		 	 }
		  */
		
		int count = 1;
		while (count <=5) {
			System.out.println("반복: " + count);
			count++;//반복횟수를 증가시킴
		}
		
		
		
		
		
	}

}
