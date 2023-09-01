package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		//1. 배열의 길이를 선언
		int[] num = new int[10]; //길이가 10인 배열 선언
		// 1~ 10 까지의 반복문을 이용해서
		
		for(int i = 0; i<num.length;i++) {
			//순서대로 배열 인덱스에 값을 넣은 후
			num[i] = i + 1;
			//System.out.println(num[i]);
		}
		// 그 값을 출력
		//for (int i = 0; i < num.length; i++) {
			//System.out.println("num[" + i + "] = " + num[i]);
		//길이가 10인 배열을 선언 1~10까지의 값을 반복문을 이용해서
		//역순으로 배열 인덱스에 넣은 후 그 값을 출력하기
		// 출력값 : 10 9 8 7 6 5 4 3 2 1
		int num2 = 0;
		for (int i = 0; num.length > i; i++) {
			num2 = num.length;
			num2 -= i;
			System.out.println(num2);
		}
		
		}
		

	}


