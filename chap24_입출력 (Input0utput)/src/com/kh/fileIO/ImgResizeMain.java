package com.kh.fileIO;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImgResizeMain {

	public static void main(String[] args) {
		//원본 이미지 파일 경로 설정하고 이미지 리사이즈한 파일 경로 설정
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path+"notcute.jpg";
		String outputImg = path+"notcute2.jpg";
		
		//리사이즈할 이미지 크기 설정
		int width = 2000; //가로 길이
		int height = 1500; //세로길이
	
		
		try {
			//원본 이미지를 읽어오기
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			//새로운 크기로 이미지 리사이즈
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			//BufferedImage 변환
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0,null);
			//리사이즈 된 이미지를 파일로 저장하기
			ImageIO.write(bufResizeImg,"jpg", new File(outputImg));
			
			System.out.println("이미지 리사이즈 완료!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 리사이즈 중 오류 발생: "+e.getMessage());
		}
	
	}

}
