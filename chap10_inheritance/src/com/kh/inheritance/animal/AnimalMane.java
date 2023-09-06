package com.kh.inheritance.animal;

public class AnimalMane {

	public static void main(String[] args) {
		Dog myDog = new Dog("大大捞");
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat mycat = new Cat("绊具固");
		mycat.run();
		mycat.eat();
		
		Lion mylion = new Lion("荤磊磊");
		mylion.eat();
		
		Monkey mymonkey = new Monkey("根虐虐");
		mymonkey.sleep();
	}

}
