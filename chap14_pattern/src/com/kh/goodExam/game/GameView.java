package com.kh.goodExam.game;

public class GameView {

	public void displayMessage() {
		String strmsg = "숫자 맞추기 게임을 시작합니다.";
		String strmsg2 = "1에서 100사이의 숫자를 맞춰보세요!";
		System.out.println(strmsg);
		System.out.println(strmsg2);
	}
	//숫자를 추측하는 값 입력하고 맞췄는지 틀렸는지 적는거랑 시도횟수 게임종료
	//1.숫자 추측하는 값 입력하기
		public void displayGuessPromt() {
			String strpro = "추측한 숫자를 입력하세요.";
			System.out.println(strpro);
		}
		
		public void displayCorrectGuess() {
			String strcorrect = "숫자를 맞췃습니다.";
			System.out.println(strcorrect);
		}
		public void displayInCorrectGuess() {
			String strincorrect = "틀렸습니다. 다시시도하세요.";
			System.out.println(strincorrect);
		}
		
		public void displayAttempts(int b) {
			String stratt = "시도횟수";
			System.out.println(stratt+b);
		}
		public void displayGameOver() {
			String strover = "게임종료!";
			System.out.println(strover);
		}
}
