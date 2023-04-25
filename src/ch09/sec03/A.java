package ch09.sec03;

public class A {
	//생성자
	A(){
		//로컬 클래스 선언
		class B{
		}
		//로켈 객체 생성
		B b = new B();
	}
	
	//메소드
	void method() {
		class B{
		}
		B b = new B();
	}
}
