package com.kh.example.practice2.model.vo;

public class ProductRun {

	public static void main(String[] args) {
		//Product ���� 3�� �ϰ� ���� ��ǰ��,���� �귣���  ����ϱ�
		
		Product product1 = new Product("����",10000, "���ɾ�" );
		product1.information();
		System.out.println("------------------");
		Product product2 = new Product("å��",20000, "�ѻ�" );
		product2.information();
		System.out.println("------------------ ");
		Product product3 = new Product("ħ��",30000, "���" );
		product3.information();
	}

}
