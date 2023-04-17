package ch08.sec02;

public class HelloMain {
	public static void main(String[] args) {
		Hello h1 = new HelloProxy();
		h1.sayHello("홍길동");
	}
}
