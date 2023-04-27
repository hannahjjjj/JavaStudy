package ch18.sec01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
	public static void main(String[] args) throws Exception {
		String of = "C:/Temp/test.jpg";
		String tf = "C;/Temp/test2.jpg";
				
		InputStream is = new FileInputStream(of);
		OutputStream os  = new FileOutputStream(tf);
		
		byte[] data = new byte[1024];
		while(true) {
			int num = is.read(data);
			if(num == -1) break;
			os.write(data,0,num);
		}
			os.flush();
			os.close();
			is.close();
			System.out.println("복사가 잘 되었습니다.");
		
	}
}
