package com.kh.practice2;

import java.util.Scanner;

public class Pratice1 {
	public static void main(String[] args) {
	    //Ű����� ���� �ϳ��� �Է� �޾� �� ������ �����ڵ带 ����ϼ���.
	    Scanner ec = new Scanner(System.in);
	    
	    char text;
	    
	    System.out.println("���� �ϳ��� �Է� �Ͻÿ� : ");
	    text = ec.next().charAt(0); // �Է¹��� ���� ���
	    
	    int text2 = text;
	    System.out.println("���� : "+text);
	    System.out.println("A unicode : "+text2);
}
}