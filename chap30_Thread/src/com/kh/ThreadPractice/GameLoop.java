package com.kh.ThreadPractice;

import java.io.IOException;
import java.util.Random;

public class GameLoop implements Runnable {
	static boolean isGameOver = false;
	@Override
	public void run() {
		while(!isGameOver) {
		int randomValue = new Random().nextInt(10);
		System.out.println("������ ����:"+randomValue);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.println("������ �����Ϸ��� Enter�� ������.");
		
		}System.out.println("���� ����");
}
}