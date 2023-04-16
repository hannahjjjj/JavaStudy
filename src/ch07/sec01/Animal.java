package ch07.sec01;

public abstract class Animal {
	public void breathe () {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound(); //추상메소드 선언
}
