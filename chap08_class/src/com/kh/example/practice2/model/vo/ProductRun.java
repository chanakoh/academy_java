package com.kh.example.practice2.model.vo;

public class ProductRun {

	public static void main(String[] args) {
		//Product 생성 3개 하고 각각 상품명,가격 브랜드명  출력하기
		
		Product product1 = new Product("의자",10000, "이케아" );
		product1.information();
		System.out.println("------------------");
		Product product2 = new Product("책상",20000, "한샘" );
		product2.information();
		System.out.println("------------------ ");
		Product product3 = new Product("침대",30000, "대우" );
		product3.information();
	}

}
