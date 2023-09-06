package com.kh.gettersetter.goodEaxm;


public class GoodPlayer {
	private String  name; 		// 캐릭터이름
	private int 	health; 	// 체력
	private int 	attackPower; // 공격파워
	
	public void setName(String name) {//이름이 변경되면 저장될 set
		this.name = name;
	}
	//검증하는 valid
	public void ValidName( ) {//캐릭터 이름에 공백이 없는지 검증!
		if(this.name == "") {
			this.name = "No name";
		}
	}
	public String getName() {//캐릭터이름을 반환
		return name;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	public int getHealth() {
		return health;
	}
	public void ValidHealth() {
		if(health <= 0) {
			this.health = 0;
		}
	}
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public int getAttackPower() {
		return attackPower;
	}
	public void ValidAttackPower() {
			if(attackPower <= 0) {
				this.attackPower = 0;
	}
	}
	//출력메소드 작성
	public void display() {
		System.out.println("캐릭터 정보 : "+this.name);
		System.out.println("체력 정보 : "+this.health);
		System.out.println("공격 파워 : "+this.attackPower);
	}
	
	
}

