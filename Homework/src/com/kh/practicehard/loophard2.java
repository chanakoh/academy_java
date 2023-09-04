package com.kh.practicehard;

import java.util.Scanner;

public class loophard2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = false;	
		//while(!isTrue) {
		System.out.println("숫자 : ");
		int num = sc.nextInt();
			
		if(num%2==1 && num>2) {
			System.out.println("소수 입니다.");
			isTrue = true;
		}else if(num<2) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
}
}
//}
