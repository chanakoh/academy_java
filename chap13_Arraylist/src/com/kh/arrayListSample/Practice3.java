package com.kh.arrayListSample;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5���� ������ �Է��ϼ���.");
		int[] numbers = new int[5];
		for(int i = 0; i<5 ; i++) {
			System.out.println("���� index"+(i) + ":");
			numbers[i] = sc.nextInt();
			/*ArrayList�� ��� colores.get(0)
				�迭�� []�ȿ� ����
				�ٵ� �迭�� �ڸ��� ����? �迭�� �ڸ����� �������߰ڴ�
				�ٱ����ٰ� int numbers�� �迭�� ����� �����! ������ ���۵Ǳ� ���� ��ü���� ��ٱ��ϴ� ���������������ڳ�*/
				
		}//������ ���� ���� ���ϴ� ���̱� ������ ���� for�� ���
		//�Ǵ� �⺻for���� ����ϰ� �ʹٸ� length�� �̿��ؼ� ��� ����
		int sum = 0;
		for(int number : numbers) {
		//	sum += numbers;
		}System.out.println("�迭�� ��� ��Ҹ� ���� ���:"+sum);
	}

}
