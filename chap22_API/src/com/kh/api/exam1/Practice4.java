package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {

	public static void main(String[] args) {
		Practice4 m = new Practice4();
		m.practice1();
		m.practice2();
		m.practice3();
		m.practice4();
		m.practice5();
		
	}
	public void practice1() {
		//yyy-MM-dd
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy년-MM월-d일");
		String forDate = sdf.format(currentDate);
		System.out.println("포맷팅된 날짜 및 시간 :"+forDate);
	}
	public void practice2() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH시-mm분-ss초");
		String forDate = sdf.format(currentDate);
		System.out.println("포맷팅된 날짜 및 시간 :"+forDate);
	}
	public void practice3() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM월-dd일");
		String forDate = sdf.format(currentDate);
		System.out.println("포맷팅된 날짜 및 시간 :"+forDate);
	}
	public void practice4() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("y년 H시");
		String forDate = sdf.format(currentDate);
		System.out.println("포맷팅된 날짜 및 시간 :"+forDate);
	}
	public void practice5() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년-MM월-dd일 E요일");
		String forDate = sdf.format(currentDate);
		System.out.println("포맷팅된 날짜 및 시간 :"+forDate);
	}

}
