package com.kh.arrayexam;

import java.util.Scanner;

public class ArrayEaxm {
	public void practice1() {
		int value =16;
		int[][] arr = new int[4][4];
		
		for(int i = 0; i <arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.println(arr[i][j]);
			}
		}
	}
	public void practice2() {
		int value = 16;
		int[][] arr = new int[4][4];
		for(int i=0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length;j++) {
				arr[i][j] = value++;
			}
		}
		for(int i = 0; i<arr.length ; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.printf("%2d",arr[i][j]);
			}
			
		}System.out.println();
	}
	public void practice3() {
		int row = 0; //행
		int col = 0; //열
		char value = 'a';
		char[][] arr = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("행의 크기 :");
		row = sc.nextInt();
		
		arr = new char[row][];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i+"행의 크기");
			col = sc.nextInt();
			
			arr[i] = new char[col];
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] =value++;
			}
		}
		for (int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void practice4() {
		int count = 0;
	String[] students = {"강건강","남나나","도대담","류라라","문미미", "박보배", "송성실","윤예의", "진재주", "차천축", "피풍표", "홍하하"};
	String[][] seat1 = new String[3][2];
	String[][] seat2 = new String[3][2];
	
	for(int i=0; i<seat1.length; i++) {
		for(int j =0; j<seat1.length; j++) {
			seat1[i][j] = students[count++];
		}
		for(int i1=0; i1<seat2.length; i1++) {
			for(int j =0; j<seat2.length; j++) {
				seat2[i1][j] = students[count++];
	}
	}
}
	}
}