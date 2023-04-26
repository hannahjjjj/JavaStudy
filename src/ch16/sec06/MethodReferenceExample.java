package ch16.sec06;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person p = new Person();
		p.ordering(String :: compareToIgnoreCase);
	}
}
