package ch19;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {
	private static ServerSocket ss = null;

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
		Thread t  =  new Thread() {
			@Override
			public void run() {
				try {
					ss = new ServerSocket(50001);
					System.out.println("서버시작됨");

					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다림\n");
						Socket so = ss.accept();

						InetSocketAddress isa = (InetSocketAddress) so.getRemoteSocketAddress();
						System.out.println("[서버]" + isa.getHostName() + "의 연결 요청을 수락함");

						so.close();
						System.out.println("[서버]" + isa.getHostName() + "의 연결을 귾음");
					}
				}catch(IOException e) {
					System.out.println("[서버]" + e.getMessage());
				}
			}
		};
		t.start();
	}
	public static void stopServer() {
		try {
			ss.close();
			System.out.println("[서버]종료됨");
		}catch(IOException e1) {}
	}
}
