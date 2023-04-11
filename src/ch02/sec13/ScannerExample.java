package ch02.sec13;

import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws IOException {
		// int data=System.in.read();
		// System.out.println(data);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x 값 입력");
		String strX=sc.nextLine();
		int x=Integer.parseInt(strX);
		
		System.out.println("Y 값 입력");
		String strY=sc.nextLine();
		int y=Integer.parseInt(strY);
		
		int result=x+y;
		System.out.println("x+y: "+result);
		System.out.println();
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data=sc.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: "+data);
			System.out.println();
		}
		System.out.println("exit");
		

	}
}
