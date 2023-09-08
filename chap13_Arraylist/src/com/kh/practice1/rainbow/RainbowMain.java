package com.kh.practice1.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		ArrayList<String> rainbow = new ArrayList<>();
		rainbow.add("빨강");
		rainbow.add("주황");
		rainbow.add("노랑");
		rainbow.add("초록");
		rainbow.add("파랑");
		rainbow.add("남");
		rainbow.add("보라");
		System.out.println("무지개 색상 :"+rainbow);
		rainbow.set(1,"블랙");
		rainbow.set(3,"브라운");
		rainbow.set(5,"그린");
		System.out.println("변경 무지개 색상 : "+rainbow);
		rainbow.add(2,"옐로우");
		rainbow.add(7,"연한파랑");
		System.out.println("추가 무지개 생상 : "+rainbow);
		for(String rainbow1 : rainbow ) {
			System.out.println(rainbow1);
		}
		System.out.println(rainbow.get(0)+rainbow.get(5)+rainbow.get(8));
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(2);
		rainbow.remove(2);
		System.out.println(rainbow);
	}

	}

