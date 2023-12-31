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
		//호스트 이름 이용해서 객체 생성
		InetAddress address1 = InetAddress.getByName("www.naver.com");
		//IP주소출력
		System.out.println("hos Name : "+address1.getHostName());
		System.out.println("IP Adress: "+address1.getHostAddress());
		
		//내가 사용하는 컴퓨터의 InetAddrsss 객체 얻기
		InetAddress localHost =InetAddress.getLocalHost();
		System.out.println("Local Host Name :"+localHost.getHostName());
		System.out.println("Local IP Adsress: "+localHost.getHostAddress());
		InetAddress address2 = InetAddress.getByName("www.google.com");
		//IP주소출력
		System.out.println("hos Name : "+address2.getHostName());
		System.out.println("IP Adress: "+address2.getHostAddress());
		InetAddress address3 = InetAddress.getByName("www.github.com");
		//IP주소출력
		System.out.println("hos Name : "+address3.getHostName());
		System.out.println("IP Adress: "+address3.getHostAddress());
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public void InetSampel() {
		//호스트의 이름을 가져와서 객체 생성
		try {
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			//IP주소를 byte배열로 얻기
			//InetAddress객체에서 IP주소를 바이트 배열로 얻음
			//IP주소를 바이트 배열로 얻으면 각 바이트를 통해 IP주소를 다룰 수 있음
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address bytes로 얻음");
			for(byte ip: ipAddress) {
				System.out.print(ip+".");
			}
			System.out.println();
			
			//도메인 명에 지정된 모든호스트의 IP주소를 배열로 얻기
			InetAddress[] alladdress = InetAddress.getAllByName("www.google.com");
			System.out.println("구글에 지정된 모든 호스트의 아이피 주소를 배열로얻음");
			for(InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
			}
			//호스트 이름 얻기
			String hostName = address.getHostName();
			System.out.println("Host Name: "+hostName);
			//지역 호스트의 IP주소 얻기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host address :"+localHost.getHostAddress());
			
			//멀티 캐스트 주소 여부 확인
			boolean isMulticast = address.isMulticastAddress();
			System.out.println("멀티캐스트 주소 입니까?"+isMulticast);
			
			//호스트 이름을 이용해서 InetAddress 객체 생성
			InetAddress name = InetAddress.getByName("www.daum.net");
			System.out.println("IP주소이름: "+name.getHostAddress());
			
			//호스트의 완전한 이름 가져오기(전체 도메인 이름)
			//호스트의 정규화된 (FQDN) 도메인의 이름을 얻음
			//FQDN : Full Qaulified Domain Name
			String hostFullName = name.getCanonicalHostName();
			System.out.println("풀네임 :"+hostFullName);
			
			//LookPask 주소 여부 확인
			boolean isLookPack = address.isLoopbackAddress();
			System.out.println("룩팩인가여 :"+isLookPack);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
