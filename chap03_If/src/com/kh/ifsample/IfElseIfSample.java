package com.kh.ifsample;

public class IfElseIfSample {
	public static void main(String[] args) {
		//if-else if-else
		/*
		 ���� ���� ������ ���������� ��, �� �� ù ��° ���� ���ǿ� �ش��ϴ� �ڵ� ����� �����ϴ� ����
		 ���� if�� else if�� ���ǵ� ���� �ƴ϶�� ������ else��� ����
		 if(����1) {
		 //���� 1�� ���� �� ����Ǵ��ڵ�
		   } else if(����2){
         //���� 2�� ���϶� ����Ǵ� �ڵ�
          } else {
          //���� ��� ������ ������ �� ����Ǵ� �ڵ�
           }
 		 * */
		int age = 23;
		if (age == 20) {
			System.out.println("�ؿܿ����� ������");
		} else if(age >=20) {
			System.out.println("���迩���� ������");
		} else {
			System.out.println("���� ��������");
		}
		
		int score = 85;
		System.out.print("�� ������ : ");
		if (score >90) {
			System.out.print("A");
		}else if(score==90) {
			System.out.print("B+");
		}else {
			System.out.print("B");
	    }System.out.println(" �Դϴ�. ");
	    
	    int hour = 15;
	    if (hour < 12) {
	    	System.out.println("���� ��ħ �Դϴ�!");
	    } else if( hour < 18){
	    	System.out.println("������ �ڵ��սô�!");
	    } else {
	    	System.out.println("�����ϼ̽��ϴ�.");
	    }
	    
	    //���� üũ
	    int temp = 28;
	    if(temp>30){
	    	System.out.println("���� ���� �Դϴ�.");
	    }else if(temp > 20){
	    	System.out.println("������ ���� �Դϴ�.");
	    }else {
	    	System.out.println("�ҽ��� ���� �Դϴ�.");
	    }
	    
	    //���ں�ȣ
	    int number = -5;
	    if (number > 0 ) {//0���� Ŭ �� ��(true)
	    	System.out.println("��� �Դϴ�.");
	    }else if(number <0) {//0���� ���� �� (true)
	    	System.out.println("���� �Դϴ�.");
	    }else { //0�϶� ��(true)
	    	System.out.println("0 �Դϴ�.");
	    }	
	    
	    /*
	     int myAge = 15; ���� ���̰� 15���϶� û�ҳ����� ������� �������� ����ϱ�
	      */
	    int myAge = 15;
	    System.out.print("�� ���̴� "+myAge+"�� �̰� ���� ");
	    if (myAge>20) {
	    	System.out.println("�����Դϴ�.");
	    }else if(myAge<14) {
	    	System.out.println("����Դϴ�.");
	    }else {
	    	System.out.println("û�ҳ��Դϴ�.");
	    }
	
	   //���� ��� �ϱ�
	    int month = 8;
	    if ( month == 1|| month == 2 || month == 12) {//1��2��12��
	    	System.out.println("�ܿ�");
	    } else if(month >= 3 && month <=5) {//3��~5��
	    	System.out.println("��");
	    } else if(month >= 6 && month <=8) {//6��~9��
	    	System.out.println("����");
	    } else {//9~11��
	    	System.out.println("����");
	    }
	
	
	
	
	
	
	
	
	
	}
}