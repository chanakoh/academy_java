package com.kh.goodExam.game;

public class GameView {

	public void displayMessage() {
		String strmsg = "¼ıÀÚ ¸ÂÃß±â °ÔÀÓÀ» ½ÃÀÛÇÕ´Ï´Ù.";
		String strmsg2 = "1¿¡¼­ 100»çÀÌÀÇ ¼ıÀÚ¸¦ ¸ÂÃçº¸¼¼¿ä!";
		System.out.println(strmsg);
		System.out.println(strmsg2);
	}
	//¼ıÀÚ¸¦ ÃßÃøÇÏ´Â °ª ÀÔ·ÂÇÏ°í ¸ÂÃè´ÂÁö Æ²·È´ÂÁö Àû´Â°Å¶û ½ÃµµÈ½¼ö °ÔÀÓÁ¾·á
	//1.¼ıÀÚ ÃßÃøÇÏ´Â °ª ÀÔ·ÂÇÏ±â
		public void displayGuessPromt() {
			String strpro = "ÃßÃøÇÑ ¼ıÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä.";
			System.out.println(strpro);
		}
		
		public void displayCorrectGuess() {
			String strcorrect = "¼ıÀÚ¸¦ ¸Â­Ÿ½À´Ï´Ù.";
			System.out.println(strcorrect);
		}
		public void displayInCorrectGuess() {
			String strincorrect = "Æ²·È½À´Ï´Ù. ´Ù½Ã½ÃµµÇÏ¼¼¿ä.";
			System.out.println(strincorrect);
		}
		
		public void displayAttempts(int b) {
			String stratt = "½ÃµµÈ½¼ö";
			System.out.println(stratt+b);
		}
		public void displayGameOver() {
			String strover = "°ÔÀÓÁ¾·á!";
			System.out.println(strover);
		}
}
