package ch09.sec02;

public class A {
	void useB(){
		class B{
		int field1 = 1;
	
	
//	B field1  = new B();
//	static int field2 = 2; 
//	static B field2 = new B();
	
	//생성자
//	A(){
//		B b = new B();
//	}
	B(){
		System.out.println("B 생성자 실행");
	}
	
	void method1() {
//		B b = new B();
		System.out.println("B-method1실행");
	}
//	
//	static void method2() {
//	
//	}
}
}
}
