package com.kh.goodExam.game;

public class GameView {

	public void displayMessage() {
		String strmsg = "���� ���߱� ������ �����մϴ�.";
		String strmsg2 = "1���� 100������ ���ڸ� ���纸����!";
		System.out.println(strmsg);
		System.out.println(strmsg2);
	}
	//���ڸ� �����ϴ� �� �Է��ϰ� ������� Ʋ�ȴ��� ���°Ŷ� �õ�Ƚ�� ��������
	//1.���� �����ϴ� �� �Է��ϱ�
		public void displayGuessPromt() {
			String strpro = "������ ���ڸ� �Է��ϼ���.";
			System.out.println(strpro);
		}
		
		public void displayCorrectGuess() {
			String strcorrect = "���ڸ� �­����ϴ�.";
			System.out.println(strcorrect);
		}
		public void displayInCorrectGuess() {
			String strincorrect = "Ʋ�Ƚ��ϴ�. �ٽýõ��ϼ���.";
			System.out.println(strincorrect);
		}
		
		public void displayAttempts(int b) {
			String stratt = "�õ�Ƚ��";
			System.out.println(stratt+b);
		}
		public void displayGameOver() {
			String strover = "��������!";
			System.out.println(strover);
		}
}
