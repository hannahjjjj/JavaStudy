package ch18.sec01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {
	public static void main(String[] args) throws Exception {
		String ofp1 = BufferExample.class.getResource("of1.jpg").getPath();
		String tfp1 = "C:/Temp/t1.jpg";		
		FileInputStream fis = new FileInputStream(ofp1);
		FileOutputStream fos = new FileOutputStream(tfp1);

		String ofp2 = BufferExample.class.getResource("of2.jpg").getPath();
		String tfp2 = "C:/Temp/t2.jpg";
		FileInputStream fis2 = new FileInputStream(ofp2);
		FileOutputStream fos2 = new FileOutputStream(tfp2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);

		long nonBufferTime = copy(fis,fos);
		System.out.println("버퍼미사용:\t" + nonBufferTime + " ns");
		long bufferTime = copy(bis,bos);
		System.out.println("버퍼 사용:\t" + bufferTime + " ns");

		fis.close();
		fos.close();
		bis.close();
		bos.close();

	}
	public static long copy(InputStream is, OutputStream os) throws Exception{
		long start = System.nanoTime();
		while(true) {
			int data = is.read();
			if(data==-1) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return(end-start);
	}
}
