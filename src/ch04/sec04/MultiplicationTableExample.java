package ch04.sec04;

import java.io.IOException;

public class MultiplicationTableExample {
	public static void main(String[] args) throws IOException {
		for(int m=2;m<=9;m++) {
			System.out.println("*** "+m+"단 ***");
			for(int n=1;n<=9;n++) {
				System.out.println(m+" x "+n+" = "+(m*n));
			}
		}
	}
}
