package ch19.sec01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class NewsClient {
	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket();
			
			String data = "정치";
			byte[] b = data.getBytes("UTF-8");
			DatagramPacket sp = new DatagramPacket(b,b.length,new InetSocketAddress("localhost",30001));
			ds.send(sp);
			while(true) {
				DatagramPacket rp = new DatagramPacket(new byte[1024], 1024);
				ds.receive(rp);
				
				String news = new String(rp.getData(),0,rp.getLength(),"UTF-8");
				System.out.println(news);
				if(news.contains("뉴스10")) {
					break;
				}
			}
			ds.close();
		}catch(Exception e) {
			
		}
	}
}
