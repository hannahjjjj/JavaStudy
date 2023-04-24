package ch14;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit t = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			t.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
