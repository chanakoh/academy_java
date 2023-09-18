package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserMapExam {

	public static void main(String[] args) {
		// HashMap 생성 UserAge
		//유저의 이름과 나이
		//특정 유저 검색
		//모든 학생과 성적 출력
		//유저 나이 수정
		//유저 탈퇴
		//최종 유저 이름 나이 출력
		
		Map<String, Integer> User = new HashMap<>();
		User.put("김씨",60);
		User.put("박씨",58);
		User.put("이씨",63);
		User.put("최씨",62);
		User.put("구씨",61);
		
		String userName = "김씨";
		if(User.containsKey(userName)) { 
			int age = User.get(userName);
			System.out.println("해당 유저의 이름은"+userName+"입니다.");
		}
		System.out.println("모든 유저의 이름과 나이 출력");
		for(Map.Entry<String,Integer> entry : User.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name+":"+age);
		}
		String UserUpdate = "김씨";
		int newAge = 20;
		User.put(UserUpdate,newAge);
		System.out.println(UserUpdate+"의 나이를 "+newAge+"로 변경합니다.");
	
		String removeUser = "구씨";
		User.remove(removeUser);
		System.out.println(removeUser+"가 제거되었습니다.");
	
		System.out.println("최종 유저 정보 출력");
		for(Map.Entry<String,Integer> entry : User.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name+":"+age);
	}
	
	}
}
