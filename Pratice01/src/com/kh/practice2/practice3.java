package com.kh.practice2;

import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		   
		int iNum1 = 10;  
	    int iNum2 = 4;
	    
	    
	    double iNumd = (double)iNum1;
	    double iNumd2 = (double)iNum2;
	    float iNumf = (float)iNum1;
	    char iNumc = (char)iNum1;
	    
	    
	    float fNum = 3.0f;
	    int fNumi = (int)fNum;
	    double fNumd = fNum;
	    
	    double dNum = 2.5;
	    int dNum2 = (int)dNum;
	    
	    char ch = 'A';
	    int chi = ch;
	    char ch3 = (char) (ch+iNumc);
	    
	    

	    System.out.println(iNum1 % iNum2); //2
	    System.out.println(dNum2); //2
	    //System.out.println((int)dNum); //2
	    
	    System.out.println(iNum2 * dNum); //10.0
	    //System.out.println((double)iNum * dNum); // 10.0 int를 double로 바꿔서 실수로 나오는 문제
	    System.out.println(iNumd); //10.0
 	    //System.out.println((double)iNum1);
	    System.out.println(iNum1 / iNumd2 ); //2.5
	    //System.out.println((double)iNum1 / (double)iNumd2 );
	    System.out.println( dNum ); //2.5
	    
	    System.out.println(fNumi ); //3
	    //System.out.println((int)fNum );
	    System.out.println( iNum1/fNumi ); //3 / (iNum/(int)fNum)
	    
	    System.out.println( iNumf/fNum); // 3.3333333 / 
	    System.out.println( iNumd/fNumd ); // 3.333333333333335 / ( (double)iNum1/fNumd )
	    
	    System.out.println( ch ); //'A'
	    System.out.println(chi  ); // 65 / ((int)ch)
	    System.out.println(chi + iNum1); //75 / int로 ch를 변경 후 더하기 ( int(ch) + iNum1)
	    System.out.println(ch3); //'K' 75로 나온 int를 ch로 변경((char)(int)ch+iNum1))

		}
}
