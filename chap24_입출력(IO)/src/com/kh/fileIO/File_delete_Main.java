package com.kh.fileIO;

import java.io.File;

public class File_delete_Main {

	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\Java_Workspace\\chap24_�����(IO)\\src";
		String originFile = mainPath+"\\\\Sd.java";
		
		//���� ��ü ����
		File fileToDelete = new File(originFile);
		
		//���ϻ���
		boolean deleted = fileToDelete.delete();
		if(deleted) {
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �����ϴµ� �����ϼ̽��ϴ�.");
		}
	}
}
