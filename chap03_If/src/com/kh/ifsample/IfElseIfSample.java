package com.kh.ifsample;

public class IfElseIfSample {
	public static void main(String[] args) {
		//if-else if-else
		/*
		 여러 개의 조건을 연속적으로 평가, 그 중 첫 번째 참인 조건에 해당하는 코드 블록을 싱행하는 구조
		 만약 if나 else if의 조건도 참이 아니라면 마지막 else블록 실행
		 if(조건1) {
		 //조건 1이 참일 때 실행되는코드
		   } else if(조건2){
         //조건 2가 참일때 실행되는 코드
          } else {
          //위의 모든 조건이 거짓일 때 실행되는 코드
           }
 		 * */
		int age = 23;
		if (age == 20) {
			System.out.println("해외여행을 갈꺼야");
		} else if(age >=20) {
			System.out.println("세계여행을 갈꺼야");
		} else {
			System.out.println("집에 있을꺼야");
		}
		
		int score = 85;
		System.out.print("내 성적은 : ");
		if (score >90) {
			System.out.print("A");
		}else if(score==90) {
			System.out.print("B+");
		}else {
			System.out.print("B");
	    }System.out.println(" 입니다. ");
	    
	    int hour = 15;
	    if (hour < 12) {
	    	System.out.println("좋은 아침 입니다!");
	    } else if( hour < 18){
	    	System.out.println("열심히 코딩합시다!");
	    } else {
	    	System.out.println("수고하셨습니다.");
	    }
	    
	    //날씨 체크
	    int temp = 28;
	    if(temp>30){
	    	System.out.println("더운 날씨 입니다.");
	    }else if(temp > 20){
	    	System.out.println("적당한 날씨 입니다.");
	    }else {
	    	System.out.println("쌀쌀한 날씨 입니다.");
	    }
	    
	    //숫자부호
	    int number = -5;
	    if (number > 0 ) {//0보다 클 때 참(true)
	    	System.out.println("양수 입니다.");
	    }else if(number <0) {//0보다 작을 때 (true)
	    	System.out.println("음수 입니다.");
	    }else { //0일때 참(true)
	    	System.out.println("0 입니다.");
	    }	
	    
	    /*
	     int myAge = 15; 나의 나이가 15살일때 청소년인지 어린이인지 성인인지 출력하기
	      */
	    int myAge = 15;
	    System.out.print("내 나이는 "+myAge+"살 이고 나는 ");
	    if (myAge>20) {
	    	System.out.println("성인입니다.");
	    }else if(myAge<14) {
	    	System.out.println("어린이입니다.");
	    }else {
	    	System.out.println("청소년입니다.");
	    }
	
	   //계절 출력 하기
	    int month = 8;
	    if ( month == 1|| month == 2 || month == 12) {//1월2월12월
	    	System.out.println("겨울");
	    } else if(month >= 3 && month <=5) {//3월~5월
	    	System.out.println("봄");
	    } else if(month >= 6 && month <=8) {//6월~9월
	    	System.out.println("여름");
	    } else {//9~11월
	    	System.out.println("가을");
	    }
	
	
	
	
	
	
	
	
	
	}
}