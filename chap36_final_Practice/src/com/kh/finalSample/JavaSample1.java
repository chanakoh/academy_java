package com.kh.finalSample;

import java.util.Scanner;

public class JavaSample1 {
public static void main(String[] args) {
	JavaSample1 a = new JavaSample1();
	a.inputText();
}
	public void inputText() {
		Scanner sc = new Scanner(System.in);
		//while(false) {
		boolean a = true;
		while(a) {
			System.out.println("���ڿ��� �Է����ּ���.");
			String str = sc.nextLine();
			if(str =="out") {
				break;
			}else {
				System.out.println(str.length());
			}
		}
		System.out.println("program Finish");
		
	}
}