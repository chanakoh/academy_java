package com.kh.api.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticeMain4 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		PracticeMain4 sd = new PracticeMain4();
		sd.practice4();
		
	}
	public void practice1() {
		
	}
	public void practice2() {
		//날짜형식 출력
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formatStr = String.format("현재날짜 : %s",smDateFormat.format(currentDate));
		System.out.println(formatStr);
	}
	public void practice3() {
		int num1 = 123;
		int num2 = 7;
		//숫자가 지정된 넓이보다 짧을 경우 앞에 0으로 채워주겠다.
		//출력되는 숫자의 최소 너비 자리 5자리로 하고싶다
		String str = String.format("숫자1:%01d , 숫자2:%d ",num1,num2);
		System.out.println(str);
	}
	public void practice4() {
		String text1 = "Hello";
		String text2 = "World";
		//10은 최소 너비 최소 10자리의 공간을 차지
		//만약 문자열이 10자리보다 짧다면 왼쪽에 공백으로 채워짐
		//만약 문자열이 -10자리보다 짧다면 오른쪽에 공백으로 채워짐
		//'따옴표로 둘러쌓아야함
		String formatStr = String.format("%-10s %10s",text1, text2);
		System.out.println(formatStr);
	}
}
