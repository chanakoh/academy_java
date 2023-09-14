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
				String inputFile ="C:\\Users\\user1\\Desktop\\런타임 데이터 영역(1).png";
				String outputFile = "C:\\Users\\user1\\Desktop\\런타임 데이터 영역(4).png";
				try(FileInputStream fis = new FileInputStream(inputFile);
						FileOutputStream fos = new FileOutputStream(outputFile)){
					byte[] buffer = new byte[1024];//1024 바이트 크기의 버퍼
					int byteRead;
					while((byteRead = fis.read(buffer))!= -1) {
						fos.write(buffer,0,byteRead);
				}
					System.out.println("파일이 복사되었습니다!");
				} catch (IOException e) {
					e.printStackTrace();
				} 
				
	}
	public void Practice2() {
		//이미지파일 jpg 또는 png 파일을 바탕화면에 저장한 후 
		// 바탕화면에다가 폴더를 만들어서
		//폴더 안에 복사한 이미지 저장하기
		String folderPath = "C:\\Users\\user1\\Desktop\\cute";
			File folder = new File(folderPath);
			if(!folder.exists()) {
				folder.mkdir();
				System.out.println("폴더가 성공적으로 생성되었습니다.");
			}else {
				System.out.println("폴더가 이미 존재 합니다.");
			}
			String inputFile ="C:\\Users\\user1\\Desktop\\런타임 데이터 영역(2).jpg";
			String outputFile = "C:\\Users\\user1\\Desktop\\cute\\런타임 데이터 영역(3).jpg";
			try(FileInputStream fis = new FileInputStream(inputFile);
					FileOutputStream fos = new FileOutputStream(outputFile)){
				byte[] buffer = new byte[2048];//1024 바이트 크기의 버퍼
				int byteRead;
				while((byteRead = fis.read(buffer))!= -1) {
					fos.write(buffer,0,byteRead);
			}
				System.out.println("파일이 복사되었습니다!");
			} catch (IOException e) {
				e.printStackTrace();
			} 	
	
	}

}
