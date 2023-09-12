package com.kh.foodStore;

import com.kh.interfaceSample.store.Store;

public class Main {

	public static void main(String[] args) {
		FoodStore order = new Order();
		order.addMenu("Â«»ÍÁÖ¹®");
		order.addMenu("Â¥Àå¸é ÁÖ¹®");
		order.addMenu("±¼Â«»ÍÁÖ¹®");
		order.printMenu();
		
		FoodStore order1 = new Order();
		order1.addMenu("Â«»Í¹ä ÁÖ¹®");
		order1.addMenu("Â¥Àå¹ä ÁÖ¹®");
		order1.addMenu("±¼Â«»Í¹ä ÁÖ¹®");
		order1.printMenu();
	
	
	
	
	}

}
