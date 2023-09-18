package com.kh.practice;

public class PracticeCopy {

	public static void main(String[] args) {
		
	}
	public void practice1() {
		String inputFile ="C:\\Users\\user1\\Desktop\\love.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\RealLove.jpg";
		
	}
	public void practice2() {
		//이미지파일 jpg 또는 png 파일을 바탕화면에 저장한 후 
		// 바탕화면에다가 폴더를 만들어서
		//폴더 안에 복사한 이미지 저장하기
		String inputFile ="C:\\Users\\user1\\Desktop\\cute.png";
		String newFolder = "C:\\Users\\user1\\Desktop\\img";
		newFolder.mkdir();
		String outputFile =newFolder+"\\"+"cute1.jpg";
	}
}
