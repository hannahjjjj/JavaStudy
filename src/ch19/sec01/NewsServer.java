package ch19.sec01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

public class NewsServer {
	private static DatagramSocket ds =null;
	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter키를 입력하세요.");
		System.out.println("==============================");
		
		startServer();
		Scanner scan = new Scanner(System.in);
		while(true) {
			String key = scan.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		scan.close();
		stopServer();
	
	}
	
	public static void startServer() {
		Thread t = new Thread() {
			@Override
			public void run() {
				try {
					ds = new DatagramSocket(30001);
					System.out.println("[서버] 시작됨"); 
					while(true) {
						DatagramPacket rp = new DatagramPacket(new byte[1024], 1024);
						ds.receive(rp);
						String newsKind = 
								new String(rp.getData(),0,rp.getLength(),"UTF-8");
							SocketAddress sa = rp.getSocketAddress();
							
							for(int i=1; i<=10; i++) {
								String data = newsKind + ":뉴스" + i;
								byte[] b = data.getBytes("UTF-8");
								DatagramPacket sp = new DatagramPacket(b,0, b.length,sa);
								ds.send(sp);
							}
					}
				}catch(Exception e) {
					System.out.println("[서버]" + e.getMessage());
				}
			}
		};
		t.start();
	}
	public static void stopServer() {
		ds.close();
		System.out.println("[서버] 종료됨");
	}
}
