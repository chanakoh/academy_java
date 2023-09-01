
package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
		 문자열을 입력 받아 문자 하나하나 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지(lenght) 개수와 몇 번째 인덱스에 위치하는지 인덱스 출력하기
		 //                                                                    (총 길이가 얼마나 되는지 확인하고, 각 자리값 출력하기)
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String inputString = sc.next();
		
		System.out.println("검색할 문자를 입력하세요."); //검색할 문자 입력 받기
		char searchChar = sc.next().charAt(0); // 첫 번째
		//문자열을 > 문자로 반환
		//안녕하세요. >{'안' '녕' '하' '세' '요'}
		//toCharArray > 문자열을 문자 배열로 변환하는 역할
		char[] charString = inputString.toCharArray();
		
		int charCount = charString.length;
		System.out.println("charCount :"+charCount);
		
		int count = 0; //검색할 문자 개수 카운트
		System.out.println(inputString + " 에 "+searchChar+" 가 존재하는 위치(인덱스");//반복문을 사용해서 위치 찾기
		for (int i =0 ; i < charCount; i++ ) {
			//만약에 내가 이 문자를 검색했을 때 이 문자는 몇 번째 인덱스에 위치하는지 인덱스 출력하기
			if(charString[i] == searchChar) {
				//charString[i] 고정값이 아니라 i값이 되야하는 이유는
				//searchChar 우리가 검색해서 문자값을 지정해주기 때문에 값이 고정되어 있어야 함
				//문자배열이 내가 검색한 문자와 일치하는지
			System.out.println(i);
			count++;
			
		}
		}
	}
		
		
		
		
	}
