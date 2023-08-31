package com.kh.practice1;

import java.util.Scanner;

public class Pratice5 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    String name;
	    System.out.println("문자열을 입력하세요 : ");
	    name = sc.nextLine();
	    
	    char first = name.charAt(0); // 문자를 1자씩 읽음
	    //한자리씩 보기 때문에 apple 1자가 넘어가 출력을 할 수 없음, 자리 위치 정해서 출력하기
	    // System.out.println("index 1번째 자리 : " + first);
	    char second = name.charAt(1);//indexNum2
	    char third = name.charAt(2);
	    
	    //String p1 = name.substring(2,3); 
	    //한자리가 아니라 자리를 지정해서 출력할 수 있음
	    // 시작만 정해도 되고, 끝을 정해도됨
	    //자라 위치 정해서출력하기
	    //시작만 작성할 경우 시작한 인덱스부터 끝까지 출력
	    
	    System.out.println("첫 번째 문자 : " + first);
		System.out.println("두 번째 문자 : " + second);
		System.out.println("세 번째 문자 : " + third);
		//System.out.println("substring : " + p1);
}
}
