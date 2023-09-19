package com.kh.stackMain;

import java.util.Stack;

public class StackMain {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
	
		//stack에 값 추가 push()
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//stack 값 삭제 pop()
		stack.pop();
		//srack 전체 값 제거(초기화)
		stack.clear();
		//stack 가장 상단의 값 출력(가장 마지막에 넣은 값)출력
		stack.peek();
		//stack의 크기 출력
		stack.size();
		//stkack empty : 스택이 비어있는지 check 비어있다면 true 하나라도 들어있다면 flase
		stack.empty();
		//stack 1이 있는지 check 1이 존재한다면 true
		stack.contains(1);
		/**
		 *	|		| 
		 * 	|	3	|
		 *	|	2	|
		 * 	|___1___|
		 **/
		
		
		
		System.out.println(stack.pop()); //3
		System.out.println(stack.pop()); //2
		System.out.println(stack);
	}
}
