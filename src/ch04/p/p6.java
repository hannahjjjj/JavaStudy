package ch04.p;

import java.io.IOException;

public class p6 {
	public static void main(String[] args) throws IOException {
		//6-2
		for(int i=1;i<6;i++) {
			for(int j=1;j<6;j++) {
				if(5-i>=j) {
				System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		//6-3
		for(int i=1;i<6;i++) {
			for(int j=1;j<i+5;j++) {
				if(5-i>=j) {
				System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
