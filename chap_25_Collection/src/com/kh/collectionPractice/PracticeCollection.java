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
		//String add �غ��� ���� ���
		
		pList.add("��");
		pList.add("��");
		pList.add("��");
		pList.add("��");
		System.out.println("List:");
		for(String plist : pList ) {
			System.out.println(plist);
		}
	}
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add�غ��� ���� ��� �ߺ��� �� add �ؾ���
		pSet.add("��");
		pSet.add("��");
		pSet.add("��");
		pSet.add("��");
		pSet.add("��");
		pSet.add("��");
		pSet.add("��");
		pSet.add("��");
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
		//Ű�� �����̿��ؼ� map put�Ѵ��� ���� �������� ����غ���
	Map<String, Integer> mymap = new HashMap<>();
	mymap.put("��",1);
	mymap.put("��",2);
	mymap.put("��",3);
	for(String kor:mymap.keySet()) {
		int code = mymap.get(kor);
		System.out.println(kor+" :"+code);
	}
	}
}

