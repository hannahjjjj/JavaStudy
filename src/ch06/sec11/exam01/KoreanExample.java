package ch06.sec11.exam01;

import java.io.IOException;

public class KoreanExample {
	public static void main(String[] args) throws IOException {
		Korean k1= new Korean("123456-1234567","김자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		
		k1.name="감자바";
	}
}
