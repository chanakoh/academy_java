package com.kh.switchsample;

import java.util.Scanner;

public class SwitchCoffe {

	public static void main(String[] args) {
		// While���� Ȱ���� switch
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		boolean isChoise = false;
		
		while(!isChoise) {//������ ���� ���� �ڵ� ����� �ݺ������� ����
			System.out.println("Ŀ���ֹ� ���ּ���. 1.�Ƹ޸�ī�� 2. ī��� 3.ȫ��");
		
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ�");
				isChoise = true;
				break;
			case 2:
				System.out.println("ī��� �ֹ�");
				isChoise = true;
				break;
			case 3:
				System.out.println("ȫ�� �ֹ�");
				isChoise = true;
				break;
			default :
				System.out.println("�߸��� ����, �ٽ��ֹ� ���");
			}
			
		}		
	}

}
