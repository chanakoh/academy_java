package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<>();
		fruit.add("딸기");
		fruit.add("바나나");
		fruit.add("수박");
		fruit.add("수박");
		Iterator<String> iter = fruit.iterator();
		
		while(iter.hasNext()) {
			String fru = iter.next();
				System.out.println(fru);
			}
		iter = fruit.iterator();
		while(iter.hasNext()) {
			String fru = iter.next();
			if(fru.equals("수박")) {
				iter.remove();
			}
			else if(fru.equals("바나나")) {
			iter.remove();
			}
		}
		System.out.println("제거 후");
		for(String a : fruit) {
			System.out.println(a);
		}
		}
		}

