package com.kh.IteratorMain;

import java.util.ArrayList;
import java.util.Iterator;

/*
Iterator
	컬렉션(데이터 크룹)을 반복(iterate)하면서 요소에 접근하는데 사용되는 인터페이스
	다양한 컬렉션 유형(ArrayList, Hashset 등)에 사용할 수 있음
	컬렉션의 요소를 읽고 삭제하는데 사용
	컬렉션의 크기나 내부 구조에 관계없이 요소에 접근할 수 있음
* */
public class IteratorMain {

	public static void main(String[] args) {
		//ArrayList 생성 및 요소 추가
		ArrayList<String> music = new ArrayList<>();
		music.add("발라드");
		music.add("댄스");
		music.add("트로트");
		
		//Iterator생성
		Iterator<String> iter = music.iterator();
		
		//Iterator를 사용하여 요소 반복
		while(iter.hasNext()) {
			String msc = iter.next();
			System.out.println(msc);
		}
	iter = music.iterator(); // 다시 Iterator초기화
	while (iter.hasNext()) {
		String msc = iter.next();
		//만약에 트로트가 들어오면 삭제하길 원한
		if(msc.equals("트로트")) {
			iter.remove();
		}
		System.out.println(msc);
	}
	//삭제 후 ArrayList 출력
	System.out.println("삭제 후 출력");
	for(String a : music) {
		System.out.println(a);
	}
	}

}
