package ch11.sec01;

public class MyEception extends RuntimeException {
	public MyEception(String message) {
		super(message);
	}
	public MyEception() {
		this("다폴트 예외 메시지");
	}
}
