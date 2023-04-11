package ch05.sec05;

import java.io.IOException;

public class SubStringExample {
	public static void main(String[] args) throws IOException {
		String ssn="880815-1234567";
		String firstNum=ssn.substring(0,6);
		System.out.println(firstNum);
		String secondNum=ssn.substring(7);
		System.out.println(secondNum);
	}
}
