package com.kh.gettersetter.goodEaxm;

public class GameRun {

	public static void main(String[] args) {
		// �÷��� ������ �����
		GoodPlayer player1 = new GoodPlayer();
		
		player1.setName("kh");
		
		
		player1.setHealth(-10); //-10ü���� �������ְ�
		player1.ValidHealth(); // -10�� ���Ἲ(���� ���� �ڵ尡 ������ ������)���� �����Ѵ�.
		
		player1.setAttackPower(-20);
		player1.ValidAttackPower();
		
		player1.display();
		
		GoodPlayer player2 = new GoodPlayer();
		player2.setName("");
		
		player2.setHealth(80);
		player2.ValidHealth();
		
		
		player2.setAttackPower(10);
		player2.ValidAttackPower();
		
		player2.display();
		
		System.out.println("attack!!! ��");
		
		//player1.attack(player2);
		//player2.attack(player1);
	}
	}
