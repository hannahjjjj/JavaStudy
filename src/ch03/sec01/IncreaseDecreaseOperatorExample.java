package ch03.sec01;

import java.io.IOException;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) throws IOException {
		int x = 10;
		int y = 10;
		int z;

		x++;
		++x;
		System.out.println("x=" + x);

		System.out.println("=======================");
		y--;
		--y;
		System.out.println("y=" + y);
		System.out.println("=======================");

		z = x++;
		System.out.println("x=" + x);
		System.out.println("z=" + z);
		System.out.println("=======================");

		z = ++x;
		System.out.println("x=" + x);
		System.out.println("z=" + z);
		System.out.println("=======================");
		
		z = ++x + y++;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
}
