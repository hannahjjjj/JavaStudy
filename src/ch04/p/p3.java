package ch04.p;

import java.io.IOException;
import java.util.Scanner;

public class p3 {
	public static void main(String[] args) throws IOException {
		int sum=0;
		for(int i=1;i<101;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
