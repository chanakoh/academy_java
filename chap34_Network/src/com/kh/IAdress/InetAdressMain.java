package com.kh.IAdress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressMain {
public static void main(String[] args) {
	InetAdressMain ia = new InetAdressMain();
	ia.InetSampel();
		
	}
	public void InetEaxm() {
	try {
		//ȣ��Ʈ �̸� �̿��ؼ� ��ü ����
		InetAddress address1 = InetAddress.getByName("www.naver.com");
		//IP�ּ����
		System.out.println("hos Name : "+address1.getHostName());
		System.out.println("IP Adress: "+address1.getHostAddress());
		
		//���� ����ϴ� ��ǻ���� InetAddrsss ��ü ���
		InetAddress localHost =InetAddress.getLocalHost();
		System.out.println("Local Host Name :"+localHost.getHostName());
		System.out.println("Local IP Adsress: "+localHost.getHostAddress());
		InetAddress address2 = InetAddress.getByName("www.google.com");
		//IP�ּ����
		System.out.println("hos Name : "+address2.getHostName());
		System.out.println("IP Adress: "+address2.getHostAddress());
		InetAddress address3 = InetAddress.getByName("www.github.com");
		//IP�ּ����
		System.out.println("hos Name : "+address3.getHostName());
		System.out.println("IP Adress: "+address3.getHostAddress());
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public void InetSampel() {
		//ȣ��Ʈ�� �̸��� �����ͼ� ��ü ����
		try {
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			//IP�ּҸ� byte�迭�� ���
			//InetAddress��ü���� IP�ּҸ� ����Ʈ �迭�� ����
			//IP�ּҸ� ����Ʈ �迭�� ������ �� ����Ʈ�� ���� IP�ּҸ� �ٷ� �� ����
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address bytes�� ����");
			for(byte ip: ipAddress) {
				System.out.print(ip+".");
			}
			System.out.println();
			
			//������ �� ������ ���ȣ��Ʈ�� IP�ּҸ� �迭�� ���
			InetAddress[] alladdress = InetAddress.getAllByName("www.google.com");
			System.out.println("���ۿ� ������ ��� ȣ��Ʈ�� ������ �ּҸ� �迭�ξ���");
			for(InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
			}
			//ȣ��Ʈ �̸� ���
			String hostName = address.getHostName();
			System.out.println("Host Name: "+hostName);
			//���� ȣ��Ʈ�� IP�ּ� ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host address :"+localHost.getHostAddress());
			
			//��Ƽ ĳ��Ʈ �ּ� ���� Ȯ��
			boolean isMulticast = address.isMulticastAddress();
			System.out.println("��Ƽĳ��Ʈ �ּ� �Դϱ�?"+isMulticast);
			
			//ȣ��Ʈ �̸��� �̿��ؼ� InetAddress ��ü ����
			InetAddress name = InetAddress.getByName("www.daum.net");
			System.out.println("IP�ּ��̸�: "+name.getHostAddress());
			
			//ȣ��Ʈ�� ������ �̸� ��������(��ü ������ �̸�)
			//ȣ��Ʈ�� ����ȭ�� (FQDN) �������� �̸��� ����
			//FQDN : Full Qaulified Domain Name
			String hostFullName = name.getCanonicalHostName();
			System.out.println("Ǯ���� :"+hostFullName);
			
			//LookPask �ּ� ���� Ȯ��
			boolean isLookPack = address.isLoopbackAddress();
			System.out.println("�����ΰ��� :"+isLookPack);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
