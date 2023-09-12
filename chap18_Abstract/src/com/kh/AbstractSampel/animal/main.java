package com.kh.AbstractSampel.animal;

public class main {

	public static void main(String[] args) {
		Dog dog  = new Dog("俺","啃啃");
		dog.getname();
		dog.makeSound();
		
		Cat cat = new Cat("绊剧捞","具克");
		cat.getname();
		cat.makeSound();
		
		
		Animal[] animal = new Animal[2];
		animal[0] = new Dog("港港捞","港港");
		animal[1] = new Cat("具克捞","具克");

		
		//2. 按盲硅凯肺 Animal 沥狼秦辑 免仿窍扁 促屈己阑 劝侩
		//Animal[] animal = new Animal[2];
	}

}
