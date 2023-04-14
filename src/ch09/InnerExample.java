package ch09;

public class InnerExample {
	public static void main(String[] args) {
		A a = new A();
//		B b = new B(); // 오류 
		A.B b = a.new B(); //인스턴스 멤버 클래스 A를 만들어야 B 객체 생성가능
		b.doIt();
		A.C c = new A.C(); //static멤버 클래스 A객체 안만들고 호출 할 수 있음
		c.doIt();
		
		
	}
}
