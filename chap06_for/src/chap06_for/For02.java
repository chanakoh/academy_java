package chap06_for;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// ������ �����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
		int num1 = sc.nextInt();
		
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		int num2 = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		int num3 = sc.nextInt();
		
		int result = 0;
		for(int i = 0; i < num2; i++) {
			for(int j =0; j < num3; j++)
			result += num1;
}	System.out.println(num1+"*" +num2+"*"+num3+"="+result);
/*
for(int i = 0; i < num2; i++) {//for ������ ����ؼ� i ������ 0���� num2�̸����� �ݺ� �� ������ �ι�° ������ num2��ŭ �ݺ�
	for(int j =0; j < num3; j++)
	result += num1;//result ������ num1 ���� ����, num2��ŭ num1�� ���ϴ� ȿ���� ��
	System.out.println("��"+num1+"*" +num2+"="+result);
}
System.out.println(num1+"*" +num2+"="+result);
//result�� ���� ����� ��� �Է� ���� �� ���ڿ� ��� ���� ���ڿ��� �����ؼ� ���
}*/
//for(int i = 2; i <=9 ; i++) {
	//for(int j = 1; j <=9 ; j++) {
		//System.out.println( i+"x"+j+"="+(i*j));

	}
	
}