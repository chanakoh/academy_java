package com.kh.variable;

public class Variableconversation {
	    //1.자동형변환(암시적형변환,묵시적형변환)
        
    public static void main(String[] args) {
    	int intNum = 100;
       long longNum = intNum; // int를 long로 자동 형변환
       System.out.println(intNum); //숫자 100을 의미
       System.out.println(longNum);
       
       float floatNum = 3.14f;
       double doubleNum = floatNum; //float를 double로 자동 형변환

       
       //int -> long 변경하는 형변환 2가지 만들고 출력하기
       int intNum2 = 1000;
       long longNum2 = intNum2;
       
       int intNum3 = 2000;
       long longNum3 = intNum3;
       
       System.out.println(intNum2 + intNum3);
       
       //short > int로 변경하는 형변환 1가지 만들고 출력하기
       
       short shortNum = 500;
       int intNum4 = shortNum;
       System.out.println( intNum4);
       
       //float > double 변경하는 형변환 1가지 만들고 출력하기
       float floatNum2 = 3.15f;
       double doubleNum2 = floatNum2;
       System.out.println( floatNum2);	   
    	
       //2. 명시적 형변환(강제 형변환)
       //long -> int
       long largeLong = 123456789012345L;
       System.out.println(largeLong);
       
       int largeInt = (int) largeLong;
       System.out.println(largeInt); // long을 int로 강제 형변환 할 경우 값이 범위안에 있지 않으면 일부 데이터는 손실된다.
       
       double largeDouble1 = 12345.6789;
       int intPart = (int) largeDouble1;
       System.out.println(intPart); // 실수를 int로 강제 형변환 할 때 (정수 부분만 유지된다.)
       
       System.out.println("------------------");
       
       //문자와 숫자간의 형변환 2개 출력
       // 문자는 char charBalue = 'z'; -> int로 변경
       char charBalue = 'A';
       int intChar = charBalue;
       char charBalue2 = 'B';
       int intChar2 = charBalue2;
       System.out.print("intChar:");
       System.out.println(intChar);
       System.out.print("intChar2:");
       System.out.println(intChar2);

       
       //double > int로 형변환 출력 1개
       double doubleA = 10.52;
       int intA = (int) doubleA;
       System.out.print("intA:");
       System.out.println(intA);
       
       // int를 short로 형변환 1개 출력
       int intS = 300;
       short shortA = (short) intS;
       System.out.print("shortA :");
       System.out.println(shortA);
       
       
    		   
    }
}
