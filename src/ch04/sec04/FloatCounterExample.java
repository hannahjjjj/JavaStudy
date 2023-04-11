package ch04.sec04;

import java.io.IOException;

public class FloatCounterExample {
	public static void main(String[] args) throws IOException {
		for (float i = 0.1f; i <= 1.0f; i+=0.1f) {
			System.out.println(i);
		}
	}
}
