package ch08;

public interface RemoteControl {
//	int DEFAULT = 10; //생략해도 public static final이 붙은것
//	void turnOn(); // public abstract

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
//
//class A{
//	int hello;
//	static int hello2 = 10;
//	static final int hello3 = 20;
//}
