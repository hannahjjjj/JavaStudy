package ch18.sec04;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
			new FileReader("src/ch18/sec04/ReadLineExample.java")
				);
		int lineNo = 1;
		while(true) {
			String s = br.readLine();
			if(s==null)break;
			System.out.println(lineNo +"\t" + s);
			lineNo++;
		}
		br.close();
	}
}
