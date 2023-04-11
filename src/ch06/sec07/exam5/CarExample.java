package ch06.sec07.exam5;

import java.io.IOException;

public class CarExample {
	public static void main(String[] args) throws IOException {
		Car car2= new Car("자가용");
		System.out.println("car2.company: "+car2.company);
		System.out.println("car2.company: "+car2.model);
		System.out.println();
		
		Car car3= new Car("자가용","빨강");
		System.out.println("car3.company: "+car3.company);
		System.out.println("car3.company: "+car3.model);
		System.out.println("car3.company: "+car3.color);
		System.out.println();

		Car car4= new Car("자가용","빨강",200);
		System.out.println("car4.company: "+car4.company);
		System.out.println("car4.company: "+car4.model);
		System.out.println("car4.company: "+car4.color);
		System.out.println("car4.company: "+car4.maxSpeed);
		System.out.println();
	}
}
