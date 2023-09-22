package com.kh.finalSample;

import java.io.FileWriter;

public class FileIOMain {
	public static void main(String[] args) {
	try {
		FileWriter fw = null;
							//2번째 인자의 값이 boolean true 지정되면 해당 파일에 이었
		fw=new FileWriter("file.txt",true);
		//fw=new FileWriter("C:\\Users\\user1\\Desktop\\file.txt");
		fw.write(10050);
		fw.write(100000);
		fw.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	
}
