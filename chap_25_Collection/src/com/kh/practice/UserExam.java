package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		Map<Integer, String> User = new HashMap<>();
		
		User.put(500,"��");
		User.put(200,"��"); 
		User.put(400,"��");
		
		int userName = 500;
		if(User.containsKey(userName)) {
			String grade = User.get(userName);
			System.out.println("����"+userName+grade);
		}else {
			System.out.println(userName+"���� ã�� �� �����ϴ�.");
		}
		
	}
	

}
