package com.kh.practice1;

import java.util.Scanner;
public class Pratice4 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
	    double width,height;
	    System.out.print("������ ���̴� ? ");
		width = sc.nextDouble();
	    System.out.print("������ ���̴� ? ");
	    height = sc.nextDouble();
	    System.out.println("���� : " + width);
	    System.out.println("���� : " + height);
	    System.out.println("���� : " + width * height);
	    System.out.println("�ѷ� : " + (width + height)*2);
		}
	
}
