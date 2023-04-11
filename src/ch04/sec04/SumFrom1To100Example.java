package ch04.sec04;

import java.io.IOException;

public class SumFrom1To100Example {
	public static void main(String[] args) throws IOException {
		int sum=0;
		int i;
		for(i=0;i<=100;i++) {
			sum+=i;
		}
		System.out.println("1~"+(i-1)+" 합:"+ sum);
	}
}
