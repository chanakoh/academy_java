package com.kh.instanc.cafe;

public class CafeMain {

	public static void main(String[] args) {
		Cafe cafe1 = new Cafe("아메리카노",1,false);
				cafe1.make();
		Cafe cafe2 = new Cafe("카페라떼",2,true);
				cafe2.make();
		Cafe cafe3 = new Cafe("카푸치노",3,false);
				cafe3.make();
	
	
	}
	

}
