package com.kh.gettersetter.goodEaxm;


public class GoodPlayer {
	private String  name; 		// ĳ�����̸�
	private int 	health; 	// ü��
	private int 	attackPower; // �����Ŀ�
	
	public void setName(String name) {//�̸��� ����Ǹ� ����� set
		this.name = name;
	}
	//�����ϴ� valid
	public void ValidName( ) {//ĳ���� �̸��� ������ ������ ����!
		if(this.name == "") {
			this.name = "No name";
		}
	}
	public String getName() {//ĳ�����̸��� ��ȯ
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
	//��¸޼ҵ� �ۼ�
	public void display() {
		System.out.println("ĳ���� ���� : "+this.name);
		System.out.println("ü�� ���� : "+this.health);
		System.out.println("���� �Ŀ� : "+this.attackPower);
	}
	
	
}

