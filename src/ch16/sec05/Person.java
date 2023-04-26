package ch16.sec05;

public class Person {
	public void action(Calcuable c) {
		double result = c.cal(10, 4);
		System.out.println("결과:" + result);
	}
}
