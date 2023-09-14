package com.kh.practice;

import java.io.File;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 m = new PracticeMain2();
		m.pracrtice1();
	}
	public void pracrtice1() {
		String dirPath ="C:\\Users\\user1\\Desktop\\name1\\name2";
		String dirPath2 ="C:\\Users\\user1\\Java_Workspace\\eee\\src\\coms";
		String dirPath3 = "C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\kPop\\Group\\god";
		File dir = new File(dirPath);
		File dir2 = new File(dirPath2);
		File dir3 = new File(dirPath3);
		
		//boolean success = dir.mkdirs();
		boolean success1 = dir2.mkdirs();
		//boolean success2 = dir3.mkdirs();
		
		if(success1) {
			System.out.println("폴더생성성공");
		}else {
			System.out.println("폴더 생성 실패");
		}
	}
	}
