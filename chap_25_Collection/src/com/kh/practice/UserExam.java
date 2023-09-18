package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		Map<Integer, String> User = new HashMap<>();
		
		User.put(500,"원");
		User.put(200,"원"); 
		User.put(400,"원");
		
		int userName = 500;
		if(User.containsKey(userName)) {
			String grade = User.get(userName);
			System.out.println("내돈"+userName+grade);
		}else {
			System.out.println(userName+"원을 찾을 수 없습니다.");
		}
		
	}
	

}
