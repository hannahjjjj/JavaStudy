package ch18;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputExample {
	public static void main(String[] args) {
		//데이터를 저장하려면...
		//1.노드를 무엇으로 할 것인가?File
		//2.입출력 단위는?byte단위
		//FileOutputStram클래스를 사용해야 함
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("test.txt");
			byte[]data = "ABCDEFGHIJKLMNOPQRSTUWXYZ".getBytes();
			fos.write(data,0,6);
			fos.flush();
			System.out.println("파일에 데이터 기록됨");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try{fos.close();}catch(Exception e) {}
		}
	}
}