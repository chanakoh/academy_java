package com.kh.practice3;

import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.�Է�");
		System.out.println("2.����");
		System.out.println("3.��ȸ");
		System.out.println("4.����");
		System.out.println("7.����");
		System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
		
		int menu = sc.nextInt();
		/** 1.if��**/
		/*	if(menu == 1) {
			System.out.println("�Է�");
		}else if(menu == 2) {
			System.out.println("����");
		}else if(menu == 3) {
	System.out.println("��ȸ");
		}else if(menu == 4) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}*/
		
		/** 2.switch��**/ 
	
		switch(menu) {
		case 1:
			System.out.println("�Է�");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("��ȸ");
			break;
		case 4:
			System.out.println("����");
			break;
		case 7:
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
			
		default :
			System.out.println("�ùٸ��� ���� �����Դϴ�.");
				
		}
		
			}

}
