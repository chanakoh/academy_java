package com.kh.api.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 d = new PracticeMain2();
		d.practice1();
		d.practice2();
		d.practice3();
		d.practice4();
		d.practice5();
		
	}
	public void practice1(){
		//���ڿ� �� ���̱� ��� append
		StringBuffer sb = new StringBuffer();
		sb.append("����");
		sb.append("������");
		sb.append("������");// ������ ������
		System.out.println(sb.toString());
	}
	public void practice2() {
			//���ڿ� ������ ���� ������ ������reverse
		StringBuffer str = new StringBuffer();
		String ab = "���Թ� ������ �ÿ�";
		str.append(ab);
		str.reverse();
		System.out.println(str.toString());
	}
	public void practice3( ) {
		//���ڿ� ���� ? ����
		StringBuffer str = new StringBuffer();
		String ab = "���� ������ ������";
		str.append(ab);
		str.insert(10,"?");
		str.insert(11,"����");
		System.out.println(str.toString());
	}
	public void practice4( ) {
		//���ڿ���ü replace(,,);
		String ab = "���� ������ ������";
		StringBuffer str = new StringBuffer(ab);
		str.replace(2,6," ������");
		System.out.println(str.toString());
	}
	public void practice5( ) {
		//���ڿ����� delete(,,);
		StringBuffer str = new StringBuffer();
		String ab = "���� ������ ������";
		str.append(ab);
		str.delete(3,7);
		System.out.println(str.toString());
	}
}
