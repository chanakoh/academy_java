package com.kh.switchsample;

public class SwitchSampel {

	public static void main(String[] args) {
		//Switch��
		/*
		 Ư�� ������ ǥ������ ���� ���� �پ��� ��츦 ó���ϴ� ���� ����
		 switch���� �Ϸ��� case���� �ش� ���� ���Ͽ� ��ġ�ϴ°�쿡 �ش��ϴ� �ڵ� ����� ����
		 �� case�� �ڿ��� ��ġ�ϴ� ���̳� ǥ������ ����
		 
		 switch (���� �Ǵ� ǥ����) {
		 case ��1 :
		      //��1�� �ش��ϴ� �ڵ�
		       break; // �ش� ����� ������ �ߴ��ϴ� ����
		 case ��2 : 
		  	  //��2�� �ش��ϴ� �ڵ�
		  	   break;
		 default :
		 	  // �� ��� ���̽��� ��ġ���� ���� �� ����Ǵ� �ڵ�
		 * */
		int day = 30;
		switch (day) {//day == 30
			case 1: //case�� 30�̸� ������ ��� false
				System.out.println("������"); //��µ��� ����
				break;
			case 2:
				System.out.println("ȭ����");//��µ��� ����
				break;
			case 30:
				System.out.println("������");
				break;
			default :
				System.out.println("�ָ�");
		}
       
		int choice = 1;
		switch (choice) {
			case 1 : 
				System.out.println("�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ�."); 
				break;
			case 2 : 
				System.out.println("ī��󶼸� �ֹ��ϼ̽��ϴ�."); 
				break;
			case 3 : 
				System.out.println("���ν���ʸ� �ֹ��ϼ̽��ϴ�."); 
				break;
			case 4 : 
				System.out.println("������Ƽ�� �ֹ��ϼ̽��ϴ�."); 
				break;
			default :
				System.out.println("�߸� �����ϼ̽��ϴ�. �ٽ� �ֹ����ּ���."); 
		}

		
		
		
		
	
	
	}

}
