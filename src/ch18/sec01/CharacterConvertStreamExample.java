package ch18.sec01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;


public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception {
		write("문자변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
		
	}
	
	public static void write(String s) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		Writer w = new OutputStreamWriter(os,"UTF-8");
		w.write(s);
		w.flush();
		w.close();
	}
	public static String read() throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		Reader r = new InputStreamReader(is,"UTF-8");
		char[]data = new char[100];
		int num = r.read(data);
		r.close();
		String s = new String(data, 0 ,num);
		return s;
	}
}
