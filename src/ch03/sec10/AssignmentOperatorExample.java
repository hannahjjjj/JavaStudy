package ch03.sec10;

import java.io.IOException;

public class AssignmentOperatorExample {
	public static void main(String[] args) throws IOException {
		int result = 0;
		result += 10;
		System.out.println("result=" + result);
		result -= 5;
		System.out.println("result=" + result);
		result *= 3;
		System.out.println("result=" + result);
		result /= 5;
		System.out.println("result=" + result);
		result %= 3;
		System.out.println("result=" + result);
	}
}
