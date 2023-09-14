package com.kh.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class inPutStreamMain {
/*
 FileInputStream
 	������ ���� �� ���Ǵ� Ŭ����
 	���Ϸκ��� �����͸� ����Ʈ ��Ʈ������ �о���� �� �����ϰ� ���
 	int read() : ���Ͽ��� ���� �����͸� �а� ��ȯ, ���̻� ���� �����Ͱ� ������ -1�� ��ȯ
 	int read(byte[] b): ���Ͽ��� ����Ʈ �迭 'b'�� �����͸� �а� 
 						������ ���� ����Ʈ ���� ��ȯ
 	int read(byte[] b, int off, int len):���Ͽ��� ����Ʈ �迭 'b'�� �������� ��ġ���� �ִ� len ����Ʈ��ŭ �о ������ ���� ����Ʈ ���� ��ȯ
 	void close() ���� �ݱ�
 * */
	public static void main(String[] args) {
		FileInputStream fis = null;
		//��δ� ���� �ۼ��ϰ� �ִ� ��Ŭ���� ���� �̸� ����
		try {
			String filename = "exam.txt";	
			FileWriter w = new FileWriter(filename);
			fis = new FileInputStream(filename);
			int data; //���Ͽ��� �����͸� �о�鿩�� ���
			System.out.println("���� ����� ��ü���� ����");
			data = fis.read();
			System.out.println("���� �б� ����");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
