package ch07;

public class ChildExample {

	public static void main(String[] args) {
		//자식 객체 생성
		Child c = new Child();
		
		//자동타입변환
		Parent p = c;
		
		p.method1();
		p.method2();
//		p.method3(); //호출 불가능 왜?==> 부모클래스에 없기 때문에
		

	}

}
