package chap06_for;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// 구구단 만들기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println("세 번째 숫자를 입력하세요.");
		int num3 = sc.nextInt();
		
		int result = 0;
		for(int i = 0; i < num2; i++) {
			for(int j =0; j < num3; j++)
			result += num1;
}	System.out.println(num1+"*" +num2+"*"+num3+"="+result);
/*
for(int i = 0; i < num2; i++) {//for 루프를 사용해서 i 변수를 0부터 num2미만까지 반복 이 루프는 두번째 숫자인 num2만큼 반복
	for(int j =0; j < num3; j++)
	result += num1;//result 변수에 num1 값을 더함, num2만큼 num1을 더하는 효과를 줌
	System.out.println("안"+num1+"*" +num2+"="+result);
}
System.out.println(num1+"*" +num2+"="+result);
//result는 계산된 결과를 출력 입력 받은 두 숫자와 결과 값을 문자열로 결합해서 출력
}*/
//for(int i = 2; i <=9 ; i++) {
	//for(int j = 1; j <=9 ; j++) {
		//System.out.println( i+"x"+j+"="+(i*j));

	}
	
}