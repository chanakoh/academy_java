package com.kh.practice1;

import java.util.Scanner;

public class Pratice3 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System. in);
			 
			 int inum1, inum2;
			 System.out.println("정수를 입력하세요. :" );
			 inum1 = sc.nextInt();
			 System.out.println("또다른 정수를 입력하세요. :");
			 inum2 = sc.nextInt();
			 
			 System.out.print("더하기 결과 : " );
			 System.out.println(inum1 + inum2);
			 System.out.print("빼기 결과 : " );
			 System.out.println(inum1 - inum2);
			 System.out.print("곱하기 결과 : " );
			 System.out.println(inum1 * inum2);
			 System.out.print("나누기 결과 : " );
			 System.out.println(inum1 / inum2);
			 
			}

}
