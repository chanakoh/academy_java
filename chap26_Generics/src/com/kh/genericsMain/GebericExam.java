package com.kh.genericsMain;

public class GebericExam {

	public static void main(String[] args) {
		// ������ �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<Integer> intBook = new Book<>();
		intBook.put(42);
		intBook.put(50);
		int intValue = intBook.get(); // ����ȯ �ʿ����
		
		//���ڿ� �����͸� �����ϴ� Book�ν��Ͻ� ����
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("llo");
		strBook.put("He");
		strBook.put("Ho");
		String strValue = strBook.get();// �� ��ȯ �� �ʿ� ����
		

		//���׸� Ŭ������ ����ؼ� �پ��� ������ ������ ó���� ���ְ� ����� �� ����
		System.out.println("Int value: "+intValue);
		System.out.println("String valye: "+strValue);
	}
	
}
