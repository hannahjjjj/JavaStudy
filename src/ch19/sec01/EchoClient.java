package ch19.sec01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) {
		try {
			Socket so = new Socket("localhost",50001);
			System.out.println("[클라이언트] 연결 성공");
			
			String sendm = "나는 자바가 좋아~";
			DataOutputStream dos = new DataOutputStream(so.getOutputStream());
			dos.writeUTF(sendm);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄:" + sendm);
			
			DataInputStream dis = new DataInputStream(so.getInputStream());
			String rm = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받음:" + rm);
			
			so.close();
			System.out.println("[클라이언트] 연결 끊음");
		}catch(Exception e) {
			
		}
	}
}
