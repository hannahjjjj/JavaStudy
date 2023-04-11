package ch06.sec08.exam04;

import java.io.IOException;

public class CalculatorExample {
	public static void main(String[] args) throws IOException {
		Calculator myCalcu=new Calculator();
		double result1 =myCalcu.areaRectangle(10);
		double result2 =myCalcu.areaRectangle(10,20);
		System.out.println("정사각형의 넓이: "+result1);
		System.out.println("직사각형의 넓이: "+result2);
		
	}
}
