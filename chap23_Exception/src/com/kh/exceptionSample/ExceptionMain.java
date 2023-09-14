package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		exmain.ExceptionExam();
	}
	public void ExceptionA() {
		try {
			int result = 10/0; //0���� ������ �õ�
			System.out.println("Result :"+result);	
		}catch(ArithmeticException e) {
			/*
			 ArithmeticException �������� ��� �������� �߻��ϴ� ����
			 ArithmeticException e : e�� �츮�� ������ ������
			 e�� ������ ������ �޼����� getMessage()�� ���� �޴´�.
			 * */
			System.out.println("��� �������� ���� �߻��� ����!!"+e.getMessage());
		}
	}
	public void ExceptionB() {
		
		
	}
	public void ExceptionN() {
		try {
			String text = null;
			int length = text.length();
			//������ ���µ� text�κ��� ���ڿ��� ���̸� ���
			System.out.println("���ڿ� ����:"+text);	
		}catch(NullPointerException e) {
			System.out.println("���ڿ��� �� �߻��� ����!"+e.getMessage());
		}
		
	}
	public void ExceptionF() {
		try {
			String juminNumber = "������904";
			int number = Integer.parseInt(juminNumber);//���ڿ��� ������ ��ȯ �õ�
			System.out.println("���� :"+number);	//�ȿ�String�� ����ֱ� ������ ������ ���� ����
		}catch(NumberFormatException n) {
			System.out.println("���ڷξ�����"+n.getMessage());
		}
		
	}
	public void ExceptionExam() {
	try {
		int[] numbers = {1,2,3,4,5};
		int index = 7;//��ȿ���� ���� �ε��� �ѹ�
		int result = numbers[index];//�迭 ��ҿ� ����
		System.out.println("Result :"+result);
	}catch(ArrayIndexOutOfBoundsException e) {
		//�迭 �ε����� ������ ����� �� �߻��ϴ� ���� ó��
		System.out.println("�迭 �ε��� ������ ��� ���ܰ� �߻�!"+e.getMessage());
	}catch(Exception e) {
		//�ٸ� ���ܸ� ó���� �� �ִ� ���� ó��
		System.out.println("�迭 �ε��� ������ ��� ���ܰ� �ƴ� �Ϲ����� �ٸ� ���� �߻�");
	}finally {
		//�׻� ����Ǵ� ���
		System.out.println("finally ����!");
	}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
