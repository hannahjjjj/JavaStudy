package ch18.sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("test.txt")){
//			int data = fis.read();
			byte[] buffer = new byte[10];
//			int readCount = fis.read(buffer);
			int readCount = 0;
			while(true) {
				readCount = fis.read(buffer);
				if(readCount<=0) break;
				System.out.println(new String(buffer));
			}
//			System.out.println(readCount);
//			System.out.println(new String(buffer,0,readCount));
			//while문 쓰는게 좋음 -> 몇번을 반복시킬지 모르니깐.
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
