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
		SimpleDateFormat sdf = new SimpleDateFormat("yyy��-MM��-d��");
		String forDate = sdf.format(currentDate);
		System.out.println("�����õ� ��¥ �� �ð� :"+forDate);
	}
	public void practice2() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH��-mm��-ss��");
		String forDate = sdf.format(currentDate);
		System.out.println("�����õ� ��¥ �� �ð� :"+forDate);
	}
	public void practice3() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM��-dd��");
		String forDate = sdf.format(currentDate);
		System.out.println("�����õ� ��¥ �� �ð� :"+forDate);
	}
	public void practice4() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("y�� H��");
		String forDate = sdf.format(currentDate);
		System.out.println("�����õ� ��¥ �� �ð� :"+forDate);
	}
	public void practice5() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��-MM��-dd�� E����");
		String forDate = sdf.format(currentDate);
		System.out.println("�����õ� ��¥ �� �ð� :"+forDate);
	}

}
