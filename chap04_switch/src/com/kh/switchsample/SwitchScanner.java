package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    	System.out.println("�����Ͻ� ���ڹ�ȣ�� �������ּ���.");
    	System.out.println("1 :����");
    	System.out.println("2 :����");
    	int con = sc.nextInt();
    	
    	switch(con) {
    	case 1:
			System.out.println("���ʸ� �����ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("������ �����ϼ̽��ϴ�.");
			break;
		default:
			System.out.println("�߸��� �����Դϴ�.");
    	}
    	
    	
    	/*switch(fruit) {
    		case 1:
    			System.out.println("���");
    			break;
    		case 2:
    			System.out.println("����");
    			break;
    		default:
    			System.out.println("�߸��� �����Դϴ�.");
    	}*/
    	
    	
    	
    	
    	
    	
		/*System.out.println("�ֹ��Ͻ� ��ȣ�� �������ּ���.");
		System.out.println("1.�Ƹ޸�ī��");
		System.out.println("2.ī���");
		System.out.println("3.���ν����");

		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("ī��� �ֹ��ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("���ν���� �ֹ��ϼ̽��ϴ�.");
			break;
		default:
			System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
		}*/
    
    
    
    
	}

}
