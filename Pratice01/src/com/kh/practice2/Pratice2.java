package com.kh.practice2;

import java.util.Scanner;
public class Pratice2 {
	public static void main(String[] args) {
	    //실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.이 때 총점과 평균은 정수형으로 처리하세요.
	    Scanner sc = new Scanner(System.in);
		
	    double kor,eng,math;
	    int sum,avg;
	    
	    System.out.println("국어 점수를 입력하시오 : ");
	    kor = sc.nextDouble();
	    System.out.println("영어 점수를 입력 하시오 : ");
	    eng = sc.nextDouble();
	    System.out.println("수학 점수를 입력 하시오 : ");
	    math = sc.nextDouble();
	    
	    sum = (int) (kor+eng+math);
	    avg = (int) (kor+eng+math)/3;
	    
	    System.out.println("국어 : " + kor);
	    System.out.println("영어 : " + eng);
	    System.out.println("수학 : " + math);
	    System.out.println("총점 : " + sum);
	    System.out.println("평균 : " + avg);
	    
		}
}
