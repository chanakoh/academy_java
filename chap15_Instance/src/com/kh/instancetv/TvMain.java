package com.kh.instancetv;

public class TvMain {

	public static void main(String[] args) {
			Tv tv; //Tv�ν��Ͻ��� �����ϱ����ؼ� ���� tv����
			tv = new Tv(); //tv�ν��Ͻ� ���� ��ü�� �ּҸ� ���������� ����
			//Tv tv1 = new Tv();
			
			tv.channel = 7; // tv�ν��Ͻ��� ������� channel�� ���� 7�� ����
			tv.channelDown(); // tv�ν��Ͻ��� �޼��� channelDown�� ȣ��
			tv.power();
			System.out.println("Channel"+tv.channel);
	}

}
