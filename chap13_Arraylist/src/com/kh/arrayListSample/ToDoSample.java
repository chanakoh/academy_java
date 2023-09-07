package com.kh.arrayListSample;

import java.util.ArrayList;
/*
 * toDoSample.java
 * ArrayList 이용해서 할일 3개만들고 2개수정하고 1개지우고 전부다 삭제
 * */
public class ToDoSample {

	public static void main(String[] args) {
		ArrayList<String> work = new ArrayList<>();
		
		work.add("설거지");
		work.add("청소");
		work.add("빨래");
		System.out.println("할일 목록 : "+work);
		
		work.set(0,"눕기");
		work.set(1,"밥먹기");
		System.out.println("변경된 목록 : "+work);
		
		work.remove(1);
		System.out.println("삭제 후 목록 : "+work);
		for(String aa : work) {
			System.out.println("할일목록 :"+aa);
		}
		work.clear();
		System.out.println("전부 삭제 후 목록 : "+work);
	}

}
