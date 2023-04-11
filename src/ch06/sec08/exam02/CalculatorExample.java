package ch06.sec08.exam02;

import java.io.IOException;

public class CalculatorExample {
	public static void main(String[] args) throws IOException {
		Computer myCom= new Computer();
		int result=myCom.sum(1,2,3);
		System.out.println("result1: "+result);
		
		result=myCom.sum(1,2,3,4,5);
		System.out.println("result2: "+result);
		
		int[] value= {1,2,3,4,5};
		result=myCom.sum(value);
		System.out.println("result3: "+result);
		
		result=myCom.sum(new int[] {1,2,3,4,5});
		System.out.println("result5: "+result);
		
	}
}
