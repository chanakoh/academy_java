package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<>();
		fruit.add("����");
		fruit.add("�ٳ���");
		fruit.add("����");
		fruit.add("����");
		Iterator<String> iter = fruit.iterator();
		
		while(iter.hasNext()) {
			String fru = iter.next();
				System.out.println(fru);
			}
		iter = fruit.iterator();
		while(iter.hasNext()) {
			String fru = iter.next();
			if(fru.equals("����")) {
				iter.remove();
			}
			else if(fru.equals("�ٳ���")) {
			iter.remove();
			}
		}
		System.out.println("���� ��");
		for(String a : fruit) {
			System.out.println(a);
		}
		}
		}

