package com.kh.foodStore;

import com.kh.interfaceSample.store.Store;

public class Main {

	public static void main(String[] args) {
		FoodStore order = new Order();
		order.addMenu("«���ֹ�");
		order.addMenu("¥��� �ֹ�");
		order.addMenu("��«���ֹ�");
		order.printMenu();
		
		FoodStore order1 = new Order();
		order1.addMenu("«�͹� �ֹ�");
		order1.addMenu("¥��� �ֹ�");
		order1.addMenu("��«�͹� �ֹ�");
		order1.printMenu();
	
	
	
	
	}

}
