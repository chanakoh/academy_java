package com.kh.AbstractSampel.animal;

public class Dog extends Animal {

	private String howling;
	
	public Dog(String name, String howling) {
		super(name);
		this.howling = howling;
	}
	@Override
	public String makeSound() {
		System.out.println("동물의 울음소리는 : "+howling);
		return howling;
		
	}


}

