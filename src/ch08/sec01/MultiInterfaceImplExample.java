package ch08.sec01;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTV();
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable sc = new SmartTV();
		
		sc.search("www.");

	}

}
