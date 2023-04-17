package ch08.sec02;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		//인터페이스 변수선언
		A a;
		//변수에 구현 객체 대입 
		a=b; //A<-B자동타입변환
		a=c;
		a=d;
		a=e;

	}

}
