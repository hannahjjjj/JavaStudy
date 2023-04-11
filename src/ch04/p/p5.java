package ch04.p;

import java.io.IOException;
import java.util.Scanner;

public class p5 {
	public static void main(String[] args) throws IOException {
		for(int i=1;i<11;i++) {
			for(int j=1;j<11;j++) {
				if((4*i)+(5*j)==60) {
					System.out.println("( "+i+", "+j+" )");
				}
			}
		}
	}
}
