package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// ���� ���ڿ� �迭 ����� �ʱ�ȭ
		
		String[][] fruits = {
				{"Apple","Banana","Cherry","ab"},
				{"Grapes","Orange","Strawberry"},
				{"Grape"},
				{"Grae"},
		};
		
	for (int i = 0; i<fruits.length; i++) {
		for(int a = 0; a<fruits.length; a++) {
			System.out.print(fruits[i][a]+" ");
		}
		System.out.println();//���������� �̵��� �� �ְ� enter�� ��� �޼ҵ� �Է�
	}

 }
}
