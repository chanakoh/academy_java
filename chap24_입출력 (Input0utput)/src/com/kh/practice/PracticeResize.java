package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		/*
		이미지 하나 불러오기
		바탕화면에 새로운 폴더 만들기 mkdir
		새로 리사이즈한 이미지 바탕화면에 새로 만든 폴더안에 저장하기
		*/
		String path = "C:\\Users\\user1\\Desktop\\newfo\\";
		String inputImg = path+"notcute2.jpg";
		String outputImg = path+"notcute3.jpg";
		/*File folder = new File(path);
		boolean success = folder.mkdirs();*/
		
		int width = 3000;
		int height = 2000;
		
		try {
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			Image resizeImg = bufImg.getScaledInstance(width, height,Image.SCALE_SMOOTH);
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0, null);
			ImageIO.write(bufResizeImg,"jpg", new File(outputImg));
			System.out.println("이미지 리사이즈 완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 리사이즈 중 오류 발생:"+e.getMessage());
		}
		
		
	}

}
