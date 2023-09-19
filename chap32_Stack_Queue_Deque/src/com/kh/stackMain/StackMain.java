package com.kh.stackMain;

import java.util.Stack;

public class StackMain {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
	
		//stack�� �� �߰� push()
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//stack �� ���� pop()
		stack.pop();
		//srack ��ü �� ����(�ʱ�ȭ)
		stack.clear();
		//stack ���� ����� �� ���(���� �������� ���� ��)���
		stack.peek();
		//stack�� ũ�� ���
		stack.size();
		//stkack empty : ������ ����ִ��� check ����ִٸ� true �ϳ��� ����ִٸ� flase
		stack.empty();
		//stack 1�� �ִ��� check 1�� �����Ѵٸ� true
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
