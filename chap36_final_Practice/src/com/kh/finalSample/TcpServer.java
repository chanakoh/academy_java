package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws IOException { 
	int port = 3333;
		
	ServerSocket server = new ServerSocket(port);
	System.out.println("서버가 포트."+port+"에서 실행중입니다.");
//while(true) {
	Socket client = server.accept();
	System.out.println("클라이언트 접속"+client.getInetAddress());
	//}

	BufferedReader in = new BufferedReader(
			new InputStreamReader(client.getInputStream()));
	 PrintWriter out = new PrintWriter(client.getOutputStream(), true);
     String clientMsg;
     while ((clientMsg = in.readLine()) != null) {
         System.out.println("클라이언트의 대화 : " + clientMsg);
	
	out.println("서버의 응답 전송:"+clientMsg);
	
	//OutputStream
	//client.close();
}
}
}

//뭔가 빠짐
//출력메서드 빠짐
/*
 	int port =3333;
	
	ServerSocket server;
	
	server = new ServerSocket(port);
	while(true) {
		Socket client = server.accept();
	}
}
 */ 
