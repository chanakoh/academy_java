package com.kh.thisSample;
/*
this = 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장
this() 현재 클래스의 다른 생성자를 호출하는데 사용)
* */

class MyClass{
	int myField;//this.myField
	
	//첫번째 생성자
	MyClass(){
		//this.myField = 0;
		this(0); //this() 사용해서 다른 생성자 호출
	}
	//두번재 생성자
	MyClass(int value){
		this.myField = value;
	}
	void printValue( ) {
		System.out.println("myField의 값 : "+ this.myField);
	}
}
public class ThisMain {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); //첫 번째 생성자 호출
		MyClass obj2 = new MyClass(10); //두 번째 생성자 호출
		obj1.printValue();
		obj2.printValue();
	
	}

}
