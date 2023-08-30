package com.kh.practice1.func;

import java.util.Scanner;

public class Variablepractice3 {
   public static void maim(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   //키보드로 가로, 세로 값을 실수형으로 입력 받아
	   
	   double width, height;
	   System.out.print("가로의 길이는 ? ");
	   width = sc.nextDouble();
	   System.out.print("세로의 길이는 ? ");
	   height = sc.nextDouble();
	   System.out.println("가로 : " + width + "세로"+ height);
	   
   }
}
