package com.kh.practice10;

public class practice10 {

	public static void main(String[] args) {
		
		String jumin = "123456-1234567";
		String makestar = "*";
		
		//to char Array����ؼ� String > char Array ����
		char[] juminStar = jumin.toCharArray();
		for(int i=8; i<=13; i++) {
			juminStar[i] = '*';
			
		}System.out.print(juminStar);
		
	}
}
