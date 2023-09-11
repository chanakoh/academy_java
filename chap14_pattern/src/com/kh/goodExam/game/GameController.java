package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	//       String
	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		//최초 메세지 보여주는거 출력하고
		view.displayMessage();
		//스캐너 입력해서 입력값 호출
		Scanner sc = new Scanner(System.in);
		
		//숫자 추측하는 값을 입력하자
		while(true) {//false가 될때까지 반복
			view.displayGuessPromt();
			int guess = sc.nextInt();
			
			if(model.inCorrectGuess(guess)) {
				//만약에 컴퓨터가 생각한 숫자를 맞췄을 때 불러올 view
				view.displayCorrectGuess();
				view.displayAttempts(model.getAttempts());
				//isTrue = false;
				break;
			}else {
				//컴퓨터가 생각한 숫자와 내가 입력한 숫자가 틀렸을때 view
				view.displayInCorrectGuess();
				view.displayAttempts(model.getAttempts());
			}	
		}
		view.displayGameOver();
	}
	
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		c.runGame();
	}

}
