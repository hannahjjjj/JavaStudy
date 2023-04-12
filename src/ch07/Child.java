package ch07;

public class Child extends Parent {
	public String field2;
	//메소드 오버라이딩
	@Override
	public void method2() {
		System.out.println("cm2");
	}
	
	public void method3() {
		System.out.println("cm3");
	}
}
