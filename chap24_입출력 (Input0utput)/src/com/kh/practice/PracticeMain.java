package com.kh.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMain pm = new PracticeMain();
		//pm.practice1();
		pm.practice2();
	}
	
	public void practice1() { //경로설정해서 파일 만들기
		try {
			//C://Users//user1//Desktop//
			FileWriter w = new FileWriter("(경로추가)FileName.txt");
			//파일 쓰기
			//파일 닫기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void practice2() {
		//폴더를 만들고 폴더 안에 파일을 만들기
		//파일 안에 내용 작성하기
		
		// File.separtor 
		// window : \
		// Linux or MacOs : /
		
		
		final String folderPath = "C:\\Users\\user1\\Desktop\\new_folders";//원하는 경로 설정
		String wpath = folderPath + "\\.git";
		File f = new File(wpath);
		// exists 이미 존재하는지 확인
		if(!f.exists()) {
			f.mkdir();
			System.out.println("Initialized empty Git repository in " +folderPath+"\\.git");
			
		} else {
			System.out.println("Reinitialized existing Git repository in C:/Users/user1/Desktop/new_folders/.git/");
		}
		
		FileWriter w;
		try {
			w = new FileWriter(wpath+"\\newTxt.txt");
			w.write("새로운 파일의 내용을 입력합니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
