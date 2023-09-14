package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("abcde.txt");//생성
			writer.write("파일덮어");//파일쓰기
			writer.close();//파일 안에 내용을 다 쓰면 닫기
			
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			while ((line = bufferedReader.readLine())!=null) {
				System.out.println(line);
			}
			bufferedReader.close(); // 다읽으면 닫기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	