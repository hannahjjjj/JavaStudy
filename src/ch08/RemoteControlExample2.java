package ch08;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		System.out.println("리모콘 최대 볼륨:" + RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최소 볼륨:" + RemoteControl.MIN_VOLUME);
		
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		//동일한 메서드는 클래스가 우선 인터페이스에 있는 걸 가져다 스려면 재정의 해야함

	}

}
