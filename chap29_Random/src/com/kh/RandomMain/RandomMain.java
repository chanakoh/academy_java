package com.kh.RandomMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 Random : 난수를 생성하기 위해 사용되는 클래스
 	난수 : 무작위로 만들어진 수
 * */
public class RandomMain {

	public static void main(String[] args) {
		RandomMain rm = new RandomMain();
		rm.Lotto();
	}
	public void Lotto() {
		Random rd = new Random();
		//1~45 범위를 지정해서 난수 생성
		//ArrayList 사용해서 장바구니로 담기
		List<Integer> lottoNum = new ArrayList<>();
		int six = 6;//로또 번호 몇 개 뽑을건지 설정
		while(lottoNum.size()<six) {
			int ranNumber = rd.nextInt(45)+1;//0~44자리에 랜덤으로 번호 하나
			//존재하는지 여부
			//중복된 값이 list에 저장될 수 있음
			if(!lottoNum.contains(ranNumber)) {//!가 사라지면 값이 존재할 때만 list에 저장되는 것이기 때문에 무한루프
				lottoNum.add(ranNumber);
			}
			}
		Collections.sort(lottoNum);
		System.out.println("로또번호 :"+lottoNum);
	}
	public void RandomExam() {
		// 로또 번호 생성기
		Random rd = new Random();//랜덤 객체 생성
		//1.정수 범위 내에서 랜덤인 난수를 만들어야 겠다
		int ranInt = rd.nextInt(100);//0~99사이에서 1개의 숫자 생성
		System.out.println(ranInt);
		
		//2.실수 범위 내에서 랜덤인 난수를 만들어야 겠다.
		double ranD = rd.nextDouble(); // 0.0~1.0
		System.out.println(ranD);

		//3.불리언 값 랜덤으로 생성
		boolean ranB = rd.nextBoolean();
				System.out.println(ranB);
	
	}
	}
