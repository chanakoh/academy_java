package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {
		
		PracticeCopy sd = new PracticeCopy();
		sd.Practice1();
	}
	public void Practice1() {
				String inputFile ="C:\\Users\\user1\\Desktop\\��Ÿ�� ������ ����(1).png";
				String outputFile = "C:\\Users\\user1\\Desktop\\��Ÿ�� ������ ����(4).png";
				try(FileInputStream fis = new FileInputStream(inputFile);
						FileOutputStream fos = new FileOutputStream(outputFile)){
					byte[] buffer = new byte[1024];//1024 ����Ʈ ũ���� ����
					int byteRead;
					while((byteRead = fis.read(buffer))!= -1) {
						fos.write(buffer,0,byteRead);
				}
					System.out.println("������ ����Ǿ����ϴ�!");
				} catch (IOException e) {
					e.printStackTrace();
				} 
				
	}
	public void Practice2() {
		//�̹������� jpg �Ǵ� png ������ ����ȭ�鿡 ������ �� 
		// ����ȭ�鿡�ٰ� ������ ����
		//���� �ȿ� ������ �̹��� �����ϱ�
		String folderPath = "C:\\Users\\user1\\Desktop\\cute";
			File folder = new File(folderPath);
			if(!folder.exists()) {
				folder.mkdir();
				System.out.println("������ ���������� �����Ǿ����ϴ�.");
			}else {
				System.out.println("������ �̹� ���� �մϴ�.");
			}
			String inputFile ="C:\\Users\\user1\\Desktop\\��Ÿ�� ������ ����(2).jpg";
			String outputFile = "C:\\Users\\user1\\Desktop\\cute\\��Ÿ�� ������ ����(3).jpg";
			try(FileInputStream fis = new FileInputStream(inputFile);
					FileOutputStream fos = new FileOutputStream(outputFile)){
				byte[] buffer = new byte[2048];//1024 ����Ʈ ũ���� ����
				int byteRead;
				while((byteRead = fis.read(buffer))!= -1) {
					fos.write(buffer,0,byteRead);
			}
				System.out.println("������ ����Ǿ����ϴ�!");
			} catch (IOException e) {
				e.printStackTrace();
			} 	
	
	}

}
