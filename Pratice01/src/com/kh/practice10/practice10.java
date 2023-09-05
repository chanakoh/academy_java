package com.kh.practice10;

public class practice10 {

	public static void main(String[] args) {
		
		String jumin = "123456-1234567";
		String makestar = "*";
		
		//to char Array사용해서 String > char Array 변경
		char[] juminStar = jumin.toCharArray();
		for(int i=8; i<=13; i++) {
			juminStar[i] = '*';
			
		}System.out.print(juminStar);
		
	}
}
