package ch06.sec14;

public class Singleton {

	private static Singleton s = new Singleton();
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		return s;
	}
}
