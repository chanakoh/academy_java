package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {
		// 1���� 100���� �� ���ϱ�
		int sum = 0; //���� ��
		int num = 1;
		
		while(num <= 5) {
			System.out.println("num�� :" + num);
			sum += num;
			// sum += 1
			num = num + 1;
			//sum�� �հ踦 �ֱ������� ��������� while�� �ȿ� �ۼ��ϱ�
		}System.out.println("sum�� :" + sum);
		//while�� ����Ǿ��ٰ� �ؼ� class�� ����� ���� �ƴ�
		//while���� ����� �� �����ִ� System.out.println(sum)�� ��µ�

	}

}
