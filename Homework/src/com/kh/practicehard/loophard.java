package com.kh.practicehard;

import java.util.Scanner;

public class loophard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		int count = 1;//count를 1로 초기화 소수가 아닌 수의 개수를 나타냄
			if(num<2) {//만약에 입력한 수가 2보다 작은 경우
				System.out.println("잘못 입력하셨습니다.");
			}else{
			}	boolean checkNum = true;//소수 여부를 판단하기 위한 boolean 변수 checkNum 초기화 처음에는 소수 가정
				for(int i=2; i<=num; i++) {
					for(int a=2; a*a <=i; a++) {//입력받은 숫자가 아닌 현재 숫자 i가 소수인지 판단하기 위한 반복 문
						//만약에 소수가 아닐경우
						/*
						 i-1해야할 경우 a*a를 대신 넣어라
						 숫자 i가 소수인지 확인하려면 2부터 i-1까지 모든 숫자로 i를 나누는 방법을 사용할 수 있음
						 a*a 사용하는 원리 :
						 만약 i가 어떤 숫자 a로 나누어 떨어진다면 i가 a의 배수라면 i/a 역시 i의 약수 중 하나
						 이때 i를 a보다 큰 숫자로 나눠 봤을 대는 이미 a로 떨어지지 않기 때문에 i/a와 i/a보다 큰숫자로 떨어지지 않는다.
						 a가 i의 약수라면 i/a 역시 i의 약수이고, a는 i/a는 서로 다른 숫자가 됨.
						 i가 소수인지 판별하기 위해 2부터 i-1까지 모든 숫자 대신  2부터 i까지의 숫자로만 나눠봐도 소수 여부 판별할 수 있음
						 a*a를 사용하는 것은 소수 판별 알고리즘을 최적화 하기 위해 사용되는 방법
						sqrt(i) : i의 제곱근을 나타내는 함수
						sqrt(16) : 결과가 4 가됨, 16의 제곱근이 4라뜻
						소수판별 sqrt(i) 소수를 판별할 때 i가 소수인지 확인하기 위해 2부터 sqrt(i)
						계산량을 줄이고 효율적으로 소수를 판별할 수 있음
						 */
						if(i%a == 0){//소수가 아닐 경우를 가정해서 작성
							checkNum = false;
							couta++;
							break;
						}
						if(checkNum) {
							//소수 일 대 값을 출력
							System.out.println(i);//출력 메소드 작성
						}
						checkNum = true;
					}
					}
						System.out.println("소수의 총 갯수 :" +(num-count)); //모든 숫자 검사가 끝난 후, 소수가 아닌
}
}
