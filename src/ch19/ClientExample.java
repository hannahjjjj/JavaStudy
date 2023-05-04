package ch19;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {
	public static void main(String[] args) {
		try {
			Socket so = new Socket("localhost",50001);
			System.out.println("클라이언트 연결 성공");
	
			so.close();
			System.out.println("클라이언트 연결 끊음");
		}catch(UnknownHostException e){
			//ip표기 잘못했을때
		}
		catch (IOException e) {
			//해당포트 연결 불가능일때
		}
	}
	}
