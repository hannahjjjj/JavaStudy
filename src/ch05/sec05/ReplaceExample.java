package ch05.sec05;

import java.io.IOException;

public class ReplaceExample {
	public static void main(String[] args) throws IOException {
		String oldStr="자바 문자열은 불변입니다 자바 문자열은 String 입니다.";
		String newStr=oldStr.replace("자바", "Java");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
