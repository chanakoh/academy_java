package com.kh.classSample2;

public class Car {
	//1.���� �ʵ� �������
	String brand; 		//�귣��
	String model; 		//��
	int speed;    		//�ӵ�
	boolean engineOn; //���� ����
	
	/*=========================*/
	//������� �ؿ��� ��� �޼���� ����
	//2. �����ڴ� �޼����� �Ѱ��� ����
	public Car(String bradn, String moedl) {//���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� ��
		this.brand = brand;
		this.model = model;
		this.speed = 0;
		this.engineOn = true;
	}
	
	//���� ���� �޼���
	public void startEngine() { // 
		//���࿡ ������ true�� ���� ���
		if(engineOn) {
			System.out.println("������ �õ��մϴ�.");//��� �޼ҵ� �ۼ�
		}else {//������ false�� �̹� ������ �����ִ�.
			System.out.println("�̹� ������ ���� �ִ�.");
		}
		}
		//���� �޼���
		public void acclerate(int amount) {
			if(engineOn) {
				System.out.println("�ӵ� ���Դϴ�.");
			}else {
			//������ true�� ���� �ӵ��� �󸶴�.
				System.out.println("�ӵ��� �� �� ����.");
			}
			
}//������ false�� ������ ���� �־� �ӵ��� �� �� ����.
}