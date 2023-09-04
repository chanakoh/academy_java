package com.kh.classSample2;

public class StudentMain {
	public static void main(String[] args) {
		//학생의 객체 생성
		Student student1 = new Student("고병찬",20,"1학년");
		Student student2 = new Student("kh1",21,"2학년");
		Student student3 = new Student("kh2",22,"3학년");
		Student student4 = new Student("kh3",23,"4학년");
		// 학생 정보 출력
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
		
		//학생을 3명 만들어서 3명 출력하기
		
		
	}
}
