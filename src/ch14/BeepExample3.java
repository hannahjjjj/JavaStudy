package ch14;

import java.awt.Toolkit;

public class BeepExample3 {
	public static void main(String[] args) {
		Thread t = new Thread() {
			@Override
			public void run() {
				Toolkit t = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					t.beep();
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			}
		};
		t.start();
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
