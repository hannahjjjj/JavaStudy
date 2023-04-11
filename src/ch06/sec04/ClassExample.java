package ch06.sec04;

import java.io.IOException;

public class ClassExample {
	public static void main(String[] args) throws IOException {
		// 클래스명 변수명 = new 생성자();
		Pen p1 = new Pen();
		Pen p2 = new Pen();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println();

		System.out.println(p1.color);
		System.out.println(p2.color);
		System.out.println();

		p2.color = "blue";
		System.out.println(p1.color);
		System.out.println(p2.color);
		System.out.println();
		
		Pen p3= new Pen("red");
		System.out.println(p3.color);
		
		

	}
}
