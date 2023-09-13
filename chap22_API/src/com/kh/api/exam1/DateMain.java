package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : 날짜와 시간 정보를 나타내는데 사용
 		java1.1이후 권장되지 않음
 			java.time 패키지 LocalDate LocalTime LocalDateTime
 * */
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 :"+currentDate);
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 :"+currentTime);
		LocalDateTime LDT = LocalDateTime.now();
		System.out.println("현재 날짜,시간 : "+LDT);
		
		//날짜 계산
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7일 후 날짜 :"+futureDate);
		
		//minus plus 각 2개씩 만들어보기
		LocalDate a =today.minusDays(5000000);
		LocalDate b =today.minusWeeks(30000000);
		LocalDate c =today.plusMonths(30000000);
		LocalDate d =today.plusYears(100000000);
		System.out.println("5000000일전:"+a);
		System.out.println("30000000주전:"+b);
		System.out.println("30000000달후:"+c);
		System.out.println("100000000년후:"+d);
		
		
		//특정 날짜와 시간 생성하기
		LocalDate date1 = LocalDate.of(2023, 9, 14);
		LocalDate date2 = LocalDate.now();
		//date1.isBefore(date2)
		//date1.isAfter(date2)
		if(date1.isBefore(date2)) {
			System.out.println(date2+"는"+date1+"보다 미래입니다.");
		}else if(date1.isAfter(date2)) {
			System.out.println(date2+"는"+date2+"보다 과거입니다.");
		}else {
			System.out.println(date2+"는 오늘입니다.");
		}

		
}
}
