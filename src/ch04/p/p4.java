package ch04.p;

import java.io.IOException;
import java.util.Scanner;

public class p4 {
	public static void main(String[] args) throws IOException {
		while(true) {
			int num1=(int)(Math.random()*6)+1;
			int num2=(int)(Math.random()*6)+1;
			System.out.println("1번째 수: "+num1+", 2 번째 수: "+num2);
			if(num1+num2==5) {
				break;
			}
		}
	}
}
