package ch05.p;

import java.io.IOException;

public class p7 {
	public static void main(String[] args) throws IOException {
		int[] array = { 1, 5, 3, 8, 2 };

		int max = Integer.MIN_VALUE;
		for (int data : array) {
			if(data>max) {
				max=data;
			}
		}
		System.out.println(max);
	}

}
