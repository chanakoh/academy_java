package com.kh.switchsample;

import java.util.Scanner;

public class SwitchCoffe {

	public static void main(String[] args) {
		// While문을 활용한 switch
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		boolean isChoise = false;
		
		while(!isChoise) {
			System.out.println("커피주문 해주세요. 1.아메리카노 2. 카페라떼 3.홍차");
		
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("아메리카노 주문");
				isChoise = true;
				break;
			case 2:
				System.out.println("카페라떼 주문");
				isChoise = true;
				break;
			case 3:
				System.out.println("홍차 주문");
				isChoise = true;
				break;
			default :
				System.out.println("잘못된 선택, 다시주문 요망");
			}
			
		}		
	}

}
