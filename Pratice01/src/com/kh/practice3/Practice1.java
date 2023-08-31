package com.kh.practice3;

import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");
		System.out.println("메뉴 번호를 입력하세요 : ");
		
		int menu = sc.nextInt();
		/** 1.if문**/
		/*	if(menu == 1) {
			System.out.println("입력");
		}else if(menu == 2) {
			System.out.println("수정");
		}else if(menu == 3) {
	System.out.println("조회");
		}else if(menu == 4) {
			System.out.println("삭제");
		}else {
			System.out.println("종료");
		}*/
		
		/** 2.switch문**/ 
	
		switch(menu) {
		case 1:
			System.out.println("입력");
			break;
		case 2:
			System.out.println("수정");
			break;
		case 3:
			System.out.println("조회");
			break;
		case 4:
			System.out.println("삭제");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
			
		default :
			System.out.println("올바르지 않은 선택입니다.");
				
		}
		
			}

}
