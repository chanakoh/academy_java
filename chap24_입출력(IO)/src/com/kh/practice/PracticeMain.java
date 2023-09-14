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
	
	public void practice1() {//경로설정해서 파일 만들기
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Java_Workspace\\chap24_입출력(IO)\\설명작성란\\FileName.txt");
			w.write("파일생성\n");
			w.write("추가되나?");
			w.close();
			
			//어디서 보던지 경로가 확실한 경로
			FileReader reader = new FileReader("C:\\Users\\user1\\Java_Workspace\\chap24_입출력(IO)\\설명작성란\\FileName.txt");
			System.out.println(reader);
			BufferedReader br = new BufferedReader(reader);
			String line;
			while ((line = br.readLine())!=null) {
				System.out.println(line);
			}
			br.close(); // 다읽으면 닫기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void practice2() {
		//폴더를 만들고 폴더 안에 파일을 만들기
		//파일 안에 내용 작성하기
		String folderPath = "C:\\Users\\user1\\Desktop\\java";
		File folder = new File(folderPath);
		folder.mkdir();
		try {
			FileWriter w = new FileWriter(folderPath+"\\java.txt");
			w.write("랜덤");
			w.write((int) Math.random()*100);
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
