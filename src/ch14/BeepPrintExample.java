package ch14;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit t = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			t.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {} //0.5초간 정지
		}
	}
}
