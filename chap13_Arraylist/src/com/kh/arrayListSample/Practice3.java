package com.kh.arrayListSample;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요.");
		int[] numbers = new int[5];
		for(int i = 0; i<5 ; i++) {
			System.out.println("정수 index"+(i) + ":");
			numbers[i] = sc.nextInt();
			/*ArrayList의 경우 colores.get(0)
				배열은 []안에 넣음
				근데 배열의 자리가 없네? 배열의 자리먼저 만들어줘야겠다
				바깥에다가 int numbers의 배열을 만들어 줘야지! 포문이 시작되기 전에 전체적인 장바구니는 ㅏㅁㄴ들어줘야하자나*/
				
		}//조건이 최종 까지 더하는 것이기 때문에 향상된 for문 사용
		//또는 기본for문을 사용하고 싶다면 length를 이용해서 출력 가능
		int sum = 0;
		for(int number : numbers) {
		//	sum += numbers;
		}System.out.println("배열의 모든 요소를 더한 결과:"+sum);
	}

}
