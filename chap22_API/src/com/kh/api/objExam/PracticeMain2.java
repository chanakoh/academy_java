package com.kh.api.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 d = new PracticeMain2();
		d.practice1();
		d.practice2();
		d.practice3();
		d.practice4();
		d.practice5();
		
	}
	public void practice1(){
		//¹®ÀÚ¿­ µ¡ ºÙÀÌ±â Ãâ·Â append
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã");
		sb.append("Àú³áÀº");
		sb.append("¹¹¸ÔÁö");// Àú³áÀº ¹¹¸ÔÁö
		System.out.println(sb.toString());
	}
	public void practice2() {
			//¹®ÀÚ¿­ µÚÁı±â ¿À´Ã Àú³áÀº ¹¹¸ÔÁöreverse
		StringBuffer str = new StringBuffer();
		String ab = "Áö¸Ô¹¹ Àº³áÀú ´Ã¿À";
		str.append(ab);
		str.reverse();
		System.out.println(str.toString());
	}
	public void practice3( ) {
		//¹®ÀÚ¿­ »ğÀÔ ? ¤¾¤¾
		StringBuffer str = new StringBuffer();
		String ab = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		str.append(ab);
		str.insert(10,"?");
		str.insert(11,"¤¾¤¾");
		System.out.println(str.toString());
	}
	public void practice4( ) {
		//¹®ÀÚ¿­´ëÃ¼ replace(,,);
		String ab = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer str = new StringBuffer(ab);
		str.replace(2,6," Á¡½ÉÀº");
		System.out.println(str.toString());
	}
	public void practice5( ) {
		//¹®ÀÚ¿­»èÁ¦ delete(,,);
		StringBuffer str = new StringBuffer();
		String ab = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		str.append(ab);
		str.delete(3,7);
		System.out.println(str.toString());
	}
}
