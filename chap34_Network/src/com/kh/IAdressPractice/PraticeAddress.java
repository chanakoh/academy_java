package com.kh.IAdressPractice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PraticeAddress {

	public static void main(String[] args) {
		PraticeAddress is = new PraticeAddress();
		is.IAad();

	}
	public void IAad() {
		try {
			InetAddress address = InetAddress.getByName("www.nd.com");
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address bytes�� ����");
			for(byte ip: ipAddress) {
				System.out.print(ip+".");
			}
			System.out.println();
			
			InetAddress[] alladdress = InetAddress.getAllByName("www.mnd.com");
			System.out.println("����Ʈ�� ���迭 ����");
			for(InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
			}
			String hostName = address.getHostName();
			System.out.println("Host Name: "+hostName);
			InetAddress localHost = InetAddress.getLoopbackAddress();
			System.out.println("Local Host address :"+localHost.getHostAddress());
			
			boolean isMulticast = address.isMulticastAddress();
			System.out.println("��Ƽĳ��Ʈ �ּ� �Դϱ�?"+isMulticast);
			
			InetAddress name = InetAddress.getByName("www.mnd.com");
			System.out.println("IP�ּ��̸�: "+name.getHostAddress());
			
			String hostFullName = name.getCanonicalHostName();
			System.out.println("Ǯ���� :"+hostFullName);
			
			boolean isLookPack = address.isLoopbackAddress();
			System.out.println("�����ΰ��� :"+isLookPack);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}	
	}
	
}
