package ch06.sec10.exam01;

import java.io.IOException;

public class CalculatorExample {
	public static void main(String[] args) throws IOException {
		double result1=10*10*Calculator.p1;
		int result2=Calculator.plus(10, 5);
		int result3=Calculator.minus(10, 5);
		
		System.out.println("resutl1: "+result1);
		System.out.println("resutl2: "+result2);
		System.out.println("resutl3: "+result3);
	}
}
