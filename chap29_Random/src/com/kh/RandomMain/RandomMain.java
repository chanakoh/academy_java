package com.kh.RandomMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 Random : ������ �����ϱ� ���� ���Ǵ� Ŭ����
 	���� : �������� ������� ��
 * */
public class RandomMain {

	public static void main(String[] args) {
		RandomMain rm = new RandomMain();
		rm.Lotto();
	}
	public void Lotto() {
		Random rd = new Random();
		//1~45 ������ �����ؼ� ���� ����
		//ArrayList ����ؼ� ��ٱ��Ϸ� ���
		List<Integer> lottoNum = new ArrayList<>();
		int six = 6;//�ζ� ��ȣ �� �� �������� ����
		while(lottoNum.size()<six) {
			int ranNumber = rd.nextInt(45)+1;//0~44�ڸ��� �������� ��ȣ �ϳ�
			//�����ϴ��� ����
			//�ߺ��� ���� list�� ����� �� ����
			if(!lottoNum.contains(ranNumber)) {//!�� ������� ���� ������ ���� list�� ����Ǵ� ���̱� ������ ���ѷ���
				lottoNum.add(ranNumber);
			}
			}
		Collections.sort(lottoNum);
		System.out.println("�ζǹ�ȣ :"+lottoNum);
	}
	public void RandomExam() {
		// �ζ� ��ȣ ������
		Random rd = new Random();//���� ��ü ����
		//1.���� ���� ������ ������ ������ ������ �ڴ�
		int ranInt = rd.nextInt(100);//0~99���̿��� 1���� ���� ����
		System.out.println(ranInt);
		
		//2.�Ǽ� ���� ������ ������ ������ ������ �ڴ�.
		double ranD = rd.nextDouble(); // 0.0~1.0
		System.out.println(ranD);

		//3.�Ҹ��� �� �������� ����
		boolean ranB = rd.nextBoolean();
				System.out.println(ranB);
	
	}
	}
