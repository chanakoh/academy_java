package com.kh.ThreadPractice;

import java.io.IOException;
import java.util.Random;

public class GameMain extends GameLoop {
	public static void main(String[] args) {
		//GameMain s= new GameMain(); 
		//���� ���� ������ ����
		Thread gameThread = new Thread(new GameLoop());
		gameThread.start();
		
		try {
			System.in.read();
			isGameOver = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		}

	

