package ch03.sec05;

import java.io.IOException;

public class InfinityAndnanCheckExample {
	public static void main(String[] args) throws IOException {
		int x=5;
		double y=0.0;
		double z=x/y;
		double z1=x%y;
		
		System.out.println(z+2);
		System.out.println(z1+2);
		
		if(Double.isInfinite(z)||Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z+2);
		}
		if(Double.isInfinite(z1)||Double.isNaN(z1)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z1+2);
		}
			
	}
}
