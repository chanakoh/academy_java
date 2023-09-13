package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : ��¥�� �ð� ������ ��Ÿ���µ� ���
 		java1.1���� ������� ����
 			java.time ��Ű�� LocalDate LocalTime LocalDateTime
 * */
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ :"+currentDate);
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� :"+currentTime);
		LocalDateTime LDT = LocalDateTime.now();
		System.out.println("���� ��¥,�ð� : "+LDT);
		
		//��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7�� �� ��¥ :"+futureDate);
		
		//minus plus �� 2���� ������
		LocalDate a =today.minusDays(5000000);
		LocalDate b =today.minusWeeks(30000000);
		LocalDate c =today.plusMonths(30000000);
		LocalDate d =today.plusYears(100000000);
		System.out.println("5000000����:"+a);
		System.out.println("30000000����:"+b);
		System.out.println("30000000����:"+c);
		System.out.println("100000000����:"+d);
		
		
		//Ư�� ��¥�� �ð� �����ϱ�
		LocalDate date1 = LocalDate.of(2023, 9, 14);
		LocalDate date2 = LocalDate.now();
		//date1.isBefore(date2)
		//date1.isAfter(date2)
		if(date1.isBefore(date2)) {
			System.out.println(date2+"��"+date1+"���� �̷��Դϴ�.");
		}else if(date1.isAfter(date2)) {
			System.out.println(date2+"��"+date2+"���� �����Դϴ�.");
		}else {
			System.out.println(date2+"�� �����Դϴ�.");
		}

		
}
}
