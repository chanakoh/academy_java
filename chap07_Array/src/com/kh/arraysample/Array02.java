package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		//1. �迭�� ���̸� ����
		int[] num = new int[10]; //���̰� 10�� �迭 ����
		// 1~ 10 ������ �ݺ����� �̿��ؼ�
		
		for(int i = 0; i<num.length;i++) {
			//������� �迭 �ε����� ���� ���� ��
			num[i] = i + 1;
			//System.out.println(num[i]);
		}
		// �� ���� ���
		//for (int i = 0; i < num.length; i++) {
			//System.out.println("num[" + i + "] = " + num[i]);
		//���̰� 10�� �迭�� ���� 1~10������ ���� �ݺ����� �̿��ؼ�
		//�������� �迭 �ε����� ���� �� �� ���� ����ϱ�
		// ��°� : 10 9 8 7 6 5 4 3 2 1
		int num2 = 0;
		for (int i = 0; num.length > i; i++) {
			num2 = num.length;
			num2 -= i;
			System.out.println(num2);
		}
		
		}
		

	}


