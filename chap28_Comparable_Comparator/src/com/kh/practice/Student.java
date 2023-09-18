package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparator<String> {

	@Override
	public int compare(String num1, String num2) {
		if(num1.length() == num2.length()) {
			return 0;
		}
		else if( num1.length()>num2.length()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		// List ArrayLst 생성 Comparator 정리
		List<String> str = new ArrayList<>();
		str.add("apple");
		str.add("cpple");
		str.add("bpple");
		str.add("고병찬");
		
		Collections.sort(str, new Student());
		for(String s : str) {
			System.out.println(s);
		}
	
	}

}
