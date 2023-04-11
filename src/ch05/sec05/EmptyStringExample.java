package ch05.sec05;

import java.io.IOException;

public class EmptyStringExample {
	public static void main(String[] args) throws IOException {
		String hobby="";
		if(hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}
	}
}
