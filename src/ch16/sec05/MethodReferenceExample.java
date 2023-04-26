package ch16.sec05;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person p = new Person();
		
		//정적메소드일경우
		p.action(Computer :: staticMethod);
		
		//인스턴스 메소드일경우
		Computer c = new Computer();
		p.action(c :: instanceMethod);
	}
}
