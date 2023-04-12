package ch07;

public class VirtualMethodInvokcationExample {
	public static void main(String[] args) {
		A a = new B();
		a.doIt();
		a = new C();
		a.doIt(); // C에는 두잇이 없기 때문에 A가 실행됨
		C c = (C)a;
		c.doThat(); // A타입에 doThat이 없기 때문에 ==> 다형적 객체에는 부모에 선언할 메서드가 꼭 있어야 함 
		A a2 =  new A();
		//B b2 =  (B)a2 //runtime error 자식이 부모를 강제 형변환 시킬 수 없음  
		//형제끼리 상속 안됨
	}
}

class A{
	public void doIt() {
		System.out.println("A");
	}
}
//	public abstract void doThat(); //abstract 구현이 안된 메서드 선언할 때 쓰임
//}
class B extends A{
	public void doIt() {
		System.out.println("B");
	}
}
//	public void doThat() {};
//}
class C extends A{
	public void doThat() {
		System.out.println("C");
	}
}


