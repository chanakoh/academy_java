package com.kh.tcpserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8080);
			System.out.println("���� ��� ��!");
			//���࿡ Ŭ���̾�Ʈ�� �����ϰ� �ʹٸ� Ŭ���̾�Ʈ�� �����ϴ� �ڵ� �ۼ�
			while(true) {
				//Ŭ���̾�Ʈ�� ���� ����ϴ� �ڵ�
				Socket client = serverSocket.accept();
				System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
				
				//�о�ö� �ڵ�
				InputStream inStream = client.getInputStream(); 
				Scanner sc = new Scanner(inStream);
				System.out.println("Server | Client:"+sc.nextLine());
				
				OutputStream outStream = client.getOutputStream();
				PrintStream printStream = new PrintStream(outStream);
				printStream.print("Hi Client");
				System.out.println("server | Client");
				printStream.flush();//������ �����͸� �� ���� ��Ƴ�
				
				client.close();//Ŭ���̾�Ʈ�� ���Ḹ ����
				System.out.println("Server"+client.getInetAddress().getHostAddress());
				
				//���� ������ ��������� ������ �Ǿ�� �ϳ� ���� ������ �ְ� ���� ��
				int count = 0;
				if(count > 7) {
					serverSocket.close();//����������
					System.out.println("Server Close");
				}
				count += 1;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
