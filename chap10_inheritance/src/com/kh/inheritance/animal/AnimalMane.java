package com.kh.inheritance.animal;

public class AnimalMane {

	public static void main(String[] args) {
		Dog myDog = new Dog("�����");
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat mycat = new Cat("��߹�");
		mycat.run();
		mycat.eat();
		
		Lion mylion = new Lion("������");
		mylion.eat();
		
		Monkey mymonkey = new Monkey("��ŰŰ");
		mymonkey.sleep();
	}

}
