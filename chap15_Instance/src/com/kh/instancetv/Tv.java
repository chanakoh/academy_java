package com.kh.instancetv;
//Tv ����
public class Tv {
	//Tv�� �Ӽ�(�ʵ�)
	String color; //����
	boolean power; //��������
	int channel; //ä��
	//TV ���(�޼���)
	public void power() {
		power = !power; //��������
	}


	public void channelup() {
		++channel;
	}
	public void channelDown() {
		--channel;
	}
}
