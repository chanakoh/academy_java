package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {
		// 1부터 100까지 합 구하기
		int sum = 0; //최종 합
		int num = 1;
		
		while(num <= 5) {
			System.out.println("num은 :" + num);
			sum += num;
			// sum += 1
			num = num + 1;
			//sum의 합계를 주기적으로 보고싶으면 while문 안에 작성하기
		}System.out.println("sum은 :" + sum);
		//while이 종료되었다고 해서 class가 종료된 것은 아님
		//while문이 종료된 후 남아있는 System.out.println(sum)이 출력됨

	}

}
