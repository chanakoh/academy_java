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
	System.out.println("������ ��Ʈ."+port+"���� �������Դϴ�.");
//while(true) {
	Socket client = server.accept();
	System.out.println("Ŭ���̾�Ʈ ����"+client.getInetAddress());
	//}

	BufferedReader in = new BufferedReader(
			new InputStreamReader(client.getInputStream()));
	 PrintWriter out = new PrintWriter(client.getOutputStream(), true);
     String clientMsg;
     while ((clientMsg = in.readLine()) != null) {
         System.out.println("Ŭ���̾�Ʈ�� ��ȭ : " + clientMsg);
	
	out.println("������ ���� ����:"+clientMsg);
	
	//OutputStream
	//client.close();
}
}
}

//���� ����
//��¸޼��� ����
/*
 	int port =3333;
	
	ServerSocket server;
	
	server = new ServerSocket(port);
	while(true) {
		Socket client = server.accept();
	}
}
 */ 
