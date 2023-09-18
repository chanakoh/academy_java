package com.kh.genericsMain;

public class GebericExam {

	public static void main(String[] args) {
		// 정수형 데이터를 저장하는 Book 인스턴스 생성
		Book<Integer> intBook = new Book<>();
		intBook.put(42);
		intBook.put(50);
		int intValue = intBook.get(); // 형변환 필요없음
		
		//문자열 데이터를 저장하는 Book인스턴스 생성
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("llo");
		strBook.put("He");
		strBook.put("Ho");
		String strValue = strBook.get();// 형 변환 할 필요 없음
		

		//제네릭 클래스를 사용해서 다양한 데이터 유형을 처리할 수있고 출력할 수 있음
		System.out.println("Int value: "+intValue);
		System.out.println("String valye: "+strValue);
	}
	
}
