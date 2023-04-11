package ch03.sec01;

import java.io.IOException;

public class SignOperatorExample {
	public static void main(String[] args) throws IOException {
		int x=-100;
		x = -x;
		System.out.println("x: "+x);
		
		byte b=-100;
		int y=-b;
		System.out.println("y: "+y);
		

	}
}
