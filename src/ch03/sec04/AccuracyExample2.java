package ch03.sec04;

import java.io.IOException;

public class AccuracyExample2 {
	public static void main(String[] args) throws IOException {
		int apple = 1;
		int totalprice = apple * 10;
		int number = 7;

		int result = totalprice - number;
		System.out.println("10조각에서 남은 조각: " + result);
		System.out.println("사과 1개에서 남은 양: " + result / 10.0);
	}
}
