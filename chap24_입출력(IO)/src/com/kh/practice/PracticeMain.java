package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {
	public static void main(String[] args) {
		PracticeMain n = new PracticeMain();
		n.practice2();
	}
	
	public void practice1() {//��μ����ؼ� ���� �����
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Java_Workspace\\chap24_�����(IO)\\�����ۼ���\\FileName.txt");
			w.write("���ϻ���\n");
			w.write("�߰��ǳ�?");
			w.close();
			
			//��� ������ ��ΰ� Ȯ���� ���
			FileReader reader = new FileReader("C:\\Users\\user1\\Java_Workspace\\chap24_�����(IO)\\�����ۼ���\\FileName.txt");
			System.out.println(reader);
			BufferedReader br = new BufferedReader(reader);
			String line;
			while ((line = br.readLine())!=null) {
				System.out.println(line);
			}
			br.close(); // �������� �ݱ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void practice2() {
		//������ ����� ���� �ȿ� ������ �����
		//���� �ȿ� ���� �ۼ��ϱ�
		String folderPath = "C:\\Users\\user1\\Desktop\\java";
		File folder = new File(folderPath);
		folder.mkdir();
		try {
			FileWriter w = new FileWriter(folderPath+"\\java.txt");
			w.write("����");
			w.write((int) Math.random()*100);
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
