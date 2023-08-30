package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    	System.out.println("구매하실 과자번호를 선택해주세요.");
    	System.out.println("1 :나초");
    	System.out.println("2 :팝콘");
    	int con = sc.nextInt();
    	
    	switch(con) {
    	case 1:
			System.out.println("나초를 선택하셨습니다.");
			break;
		case 2:
			System.out.println("팝콘을 선택하셨습니다.");
			break;
		default:
			System.out.println("잘못된 선택입니다.");
    	}
    	
    	
    	/*switch(fruit) {
    		case 1:
    			System.out.println("사과");
    			break;
    		case 2:
    			System.out.println("포도");
    			break;
    		default:
    			System.out.println("잘못된 선택입니다.");
    	}*/
    	
    	
    	
    	
    	
    	
		/*System.out.println("주문하실 번호를 선택해주세요.");
		System.out.println("1.아메리카노");
		System.out.println("2.카페라떼");
		System.out.println("3.아인슈페너");

		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("아메리카노 주문하셨습니다.");
			break;
		case 2:
			System.out.println("카페라떼 주문하셨습니다.");
			break;
		case 3:
			System.out.println("아인슈페너 주문하셨습니다.");
			break;
		default:
			System.out.println("잘못된 선택입니다. 다시 주문해주세요.");
		}*/
    
    
    
    
	}

}
