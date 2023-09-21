package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) throws IOException {
	String serverIP;
	int port = 3333;
	serverIP = InetAddress.getLocalHost().getHostAddress();
	Socket socket = new Socket(serverIP,port);
	 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	 
	 //클라이언트와 통신을위한 입 출력 스트림 설정
	 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	//OutputStream out = socket.OutputStream();
	 BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
	 String userInputString;
     System.out.println("서버와 대화를 시작합니다. 종료하려면 'exit'를 입력하세요.");
     while ((userInputString = userInput.readLine()) != null) {
         out.println(userInputString);
         String serverResponse = in.readLine();
         System.out.println("서버 응답 : " + serverResponse);
         if ("exit".equalsIgnoreCase(userInputString)) {
             break;
         }
     }
	 socket.close();
}
}
//출력메서드
/*
int port =3333;
String serverIP;

try {
	serverIP = InetAddress.getLocalHost().getHostAddress();
	Socket socket = new Socket(serverIP, port);
}catch(Exception e) {
	e.printStackTrace();
}
*/