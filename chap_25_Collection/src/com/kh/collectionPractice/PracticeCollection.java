package com.kh.collectionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		//pc.practiceList();
		//pc.practiceSet();
		pc.practiceMap();
	}
	public void practiceList() {
		List<String> pList = new ArrayList<>();
		//String add 해보고 포문 출력
		
		pList.add("가");
		pList.add("나");
		pList.add("다");
		pList.add("라");
		System.out.println("List:");
		for(String plist : pList ) {
			System.out.println(plist);
		}
	}
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add해보고 포문 출력 중복된 값 add 해야함
		pSet.add("가");
		pSet.add("나");
		pSet.add("다");
		pSet.add("라");
		pSet.add("마");
		pSet.add("바");
		pSet.add("사");
		pSet.add("사");
		pSet.add("1");
		pSet.add("2");
		pSet.add("3");
		pSet.add("4");
		pSet.add("4");
		System.out.println("SET:");
		for(String pset : pSet ) {
			System.out.println(pset);
		}
	}
	public void practiceMap() {
		//키와 값을이용해서 map put한다음 향상된 포문으로 출력해보기
	Map<String, Integer> mymap = new HashMap<>();
	mymap.put("가",1);
	mymap.put("나",2);
	mymap.put("다",3);
	for(String kor:mymap.keySet()) {
		int code = mymap.get(kor);
		System.out.println(kor+" :"+code);
	}
	}
}

